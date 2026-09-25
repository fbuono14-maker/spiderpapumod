# arachnomod — port a Forge 1.20.1 (punto de partida)

Este proyecto es un **andamiaje (scaffold) funcional**, no un port completo del
comportamiento original.

## Qué SÍ incluye y compila
- Proyecto Gradle/Forge 1.20.1 (Forge 47.3.0, mappings oficiales) listo para
  abrir en IntelliJ.
- Los dos ítems del mod original registrados: `spider_tamer` y
  `spider_spawn_egg`, con sus texturas y nombres reales extraídos del build
  ya existente del mod.
- **Sin recetas de crafteo en ningún lado** (no hay carpeta
  `data/arachnomod/recipe`): los ítems solo se pueden obtener desde la
  pestaña de Creativo (grupo "Arachnomod") o con
  `/give <jugador> arachnomod:spider_tamer`.

## Qué NO incluye todavía
El plugin original (~6000 líneas de Kotlin sobre la API de Paper/Bukkit)
implementa un motor de animación procedural completo: cadenas cinemáticas
para las patas, un sistema de entidades propio basado en "display entities"
manipuladas por paquetes, un scheduler, comandos personalizados (`/preset`,
`/options`, `/scale`, etc.) y el renderizado de la araña en sí.

Nada de eso existe en Forge de la misma forma: Bukkit/Paper y Forge son dos
APIs distintas que no se traducen línea por línea. Portarlo de verdad implica
reescribir esa lógica usando el sistema de entidades, eventos de tick y
renderers propios de Forge — un trabajo grande que conviene hacer por partes
(primero la entidad base, después el modelo/renderer, después la IK de las
patas, etc.) en vez de intentarlo todo de una sola vez.

Este scaffold es el punto de partida limpio para ese trabajo incremental.
