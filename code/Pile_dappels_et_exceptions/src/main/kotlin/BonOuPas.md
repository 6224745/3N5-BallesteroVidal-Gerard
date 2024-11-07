Exemple 1
pas bon car les exceptions sont traitées selon une hiérarchie.
L'exception ArrayIndexOutOfBoundsException est une sous-classe de Exception,
ce qui signifie que toute exception de type ArrayIndexOutOfBoundsException
sera capturée par le premier bloc catch (e: Exception), 
avant même d'atteindre le second bloc catch 
(a: ArrayIndexOutOfBoundsException).

Exemple 2
pas bon car elle capturer une exception sans la traiter