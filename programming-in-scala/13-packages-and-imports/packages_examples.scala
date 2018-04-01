package bobrockets {
    package navigation {
        class Navigation {
            val map = new StarMap
        }

        package tests {
            class NavigationTest {
                val nav = new Navigation
            }
        }

        class StarMap
    }

    class Ship {
        val nav = new navigation.Navigation
    }

    package fleets {
        class Fleet {
            val ship = new Ship
        }
    }
}
