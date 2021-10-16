removeIf(Predicate)

foreach(Consumer)

map(Function)

Streams

Criar uma stream

� Basta chamar o m�todo stream() ou parallelStream() a partir
de qualquer objeto Collection.
https://docs.oracle.com/javase/10/docs/api/java/util/Collection.html

� Outras formas de se criar uma stream incluem:

� Stream.of

� Stream.ofNullable

� Stream.iterate

http://www.oracle.com/technetwork/pt/articles/java/streams-api-java-8-3410098-ptb.html

Pipeline: opera��es em streams retornam novas streams. Ent�o � poss�vel
criar uma cadeia de opera��es (fluxo de processamento).

O pipeline � composto por zero ou mais opera��es intermedi�rias e
uma terminal.

Opera��es intermedi�rias:

� filter

� map

� flatmap

� peek

� distinct

� sorted

� skip

� limit (*)
* short-circuit

Opera��es terminais

� forEach

� forEachOrdered

� toArray

� reduce

� collect

� min

� max

� count

� anyMatch (*)
* short-circuit

� allMatch (*)
* short-circuit

� noneMatch (*)
* short-circuit

� findFirst (*)
* short-circuit

� findAny (*)
* short-circuit