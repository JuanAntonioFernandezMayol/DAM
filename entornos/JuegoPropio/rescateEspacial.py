import pygame
import elementos
import random
import pygame_menu

#Iniciamos el juego
pygame.init()
#Creamos una fuente para la pausa
font = pygame.font.Font(None, 30)
#Creamos la pantalla
tamanyo = (800, 600)
pantalla = pygame.display.set_mode(tamanyo)

#Creamo un reloj para limitar el framerate
reloj = pygame.time.Clock()
FPS = 30

ultimo_enemigo_creado = 0
ultimo_aliado_creado = 0
frecuencia_creacion_enemigos = 2000
frecuencia_creacion_aliados = 2000
#Creamos el bucle principal
#Creamos el menu del juego
def set_difficulty(value, difficulty):
    # Do the job here !
    global frecuencia_creacion_enemigos
    frecuencia_creacion_enemigos = difficulty
    frecuencia_creacion_aliados = difficulty

def start_the_game():
    # Do the job here !
    #Booleano de control
    running = [True]
    
    global frecuencia_creacion_aliados
    global ultimo_aliado_creado
    global ultimo_enemigo_creado
    global frecuencia_creacion_enemigos
    global FPS
    global reloj
    #Creamos la nave
    posicion = (360,500)
    nave = elementos.Nave(posicion)
    
    grupo_sprite_balas = pygame.sprite.Group()
    grupo_sprite_enemigos = pygame.sprite.Group()
    grupo_sprite_todos = pygame.sprite.Group()
    grupo_sprite_aliado = pygame.sprite.Group()
    grupo_sprite_todos.add(elementos.Fondo((0, 0)))
    grupo_sprite_todos.add(elementos.Fondo((0, -pantalla.get_height())))
    grupo_sprite_todos.add(nave)
    enemigo = elementos.Enemigo((50,50))
    grupo_sprite_enemigos.add(enemigo)
    aliado = elementos.Aliado((50,50))
    grupo_sprite_aliado.add(aliado)
    pausado = False
    
    
    while running[0]:
    #limitamos el bucle al framerate que hemos definido
        reloj.tick(FPS)
        #Gestionamos la salida
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running[0] = False
        
        #Capturamos las teclas
        teclas = pygame.key.get_pressed()
        if teclas[pygame.K_SPACE]:
            # running[0] = False
            nave.disparar(grupo_sprite_todos, grupo_sprite_balas)
        if teclas[pygame.K_p]:
            pausado = not pausado
    
        
        if not pausado:
            #Creacion de enemigos
            
            momento_actual = pygame.time.get_ticks()
            if (momento_actual > ultimo_enemigo_creado + frecuencia_creacion_enemigos):
                cordX = random.randint(0, pantalla.get_width())
                cordY = -200
                # X = random.randint(0,600)
                #Creamos el enemigo y lo añadismos a los grupos.
                enemigo = elementos.Enemigo((cordX, cordY))
                grupo_sprite_todos.add(enemigo)
                grupo_sprite_enemigos.add(enemigo)
                #Actualizamos el momento del ultimo enemigo creado
                ultimo_enemigo_creado = momento_actual
                
            if (momento_actual > ultimo_aliado_creado + frecuencia_creacion_aliados):
                cordX = random.randint(0, pantalla.get_width())
                cordY = -200
                aliado = elementos.Aliado((cordX, cordY))
                grupo_sprite_todos.add(aliado)
                grupo_sprite_aliado.add(aliado)
                ultimo_aliado_creado = momento_actual
            
            #Pintamos
            pantalla.fill((255, 255, 255))
            grupo_sprite_todos.update(teclas, grupo_sprite_todos, grupo_sprite_balas, grupo_sprite_enemigos, running, grupo_sprite_aliado)
        
        grupo_sprite_todos.draw(pantalla)
        #Si pausa escribe esto:
        if pausado:
            texto = font.render("PAUSA", True, "White")
            pantalla.blit(texto, (pantalla.get_width() /2, pantalla.get_height() /2))
        


        #Redibujar la pantalla
        pygame.display.flip()

menu = pygame_menu.Menu('Welcome', 400, 300, theme=pygame_menu.themes.THEME_BLUE)

menu.add.text_input('Name :', default='John Doe')
menu.add.selector('Difficulty :', [('Hard', 200), ('Easy', 2000)], onchange=set_difficulty)
menu.add.button('Play', start_the_game)
menu.add.button('Quit', pygame_menu.events.EXIT)

menu.mainloop(pantalla)
#Finalizamos el juego
pygame.quit()