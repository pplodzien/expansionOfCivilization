# Expansion Of Civilization

Application simulates expansion of civilization. Ends when population gets to the limit of 100 000 people.

It starts with 4 initial cities placed next to each other with population of 10 000 people in each city. Cities are placed on areas with resources of water, wood and steel. Every resource has initial value (1-10) on the field and restore indicator based on type of field:
- lake (20-30 of water, 10-20 of wood, 0-10 of steel, minimum number of population 100, maximum number of population 200)
- forest ( 20-30 of wood, 0-10 of water, 0-10 of steel, minimum number of population 10, maximum number of population 70)
- marshland (10-20 of water, 10-20 of wood, 10-20 of steel, minimum number of population 100, maximum number of population 200)
- desert (0-10 of water, 0-10 of wood, 20-30 of steel, minimum number of population 100, maximum number of population 200)
- meadow (0-10 of water, 0-10 of wood, 0-10 of steel, minimum number of population 100, maximum number of population 200)

Initial values and restore indicators are generated randomly. Expansion is cyclical and each cycle takes 1 second. On the beginning of cycle resources are restored for each city area. During cycle cities can take over new areas if they have enough resources and field is not occupied by any other city. Overtaking of new area costs 10 points of each resource. Every cycle each city submits offer for resources to other cities if it has excess of one of resources. Cities strive to balance resources to acquire as many new areas as possible. Excess of resource means that amount of this resource is twice or more as big compared to other resources. At the end of cycle cities decide if they can grow population based of water resources they collected. Each person uses 1 point of water. Population can grow by 30% at most every cycle. At the beginning of the turn, the city receives water units from its fields. 60% of water units that are not needed to maintain the population can spend on expansion. The remaining 40% of units are preserved for the development of the population. Cities distribute water to areas with smaller required number of inhabitants first. When there is no enough water for people in area and population falls below minimum number of population, areas are becomes free to take up by other cities and cost them half of resources. At the beginning cities are looking for those abandoned areas - because of the lower costs.
Every 10 cycles report is printed about actual resource status and population of cities. 

