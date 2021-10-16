removeIf(Predicate)

foreach(Consumer)

map(Function)

Streams

Criar uma stream

• Basta chamar o método stream() ou parallelStream() a partir
de qualquer objeto Collection.
https://docs.oracle.com/javase/10/docs/api/java/util/Collection.html

• Outras formas de se criar uma stream incluem:

• Stream.of

• Stream.ofNullable

• Stream.iterate

http://www.oracle.com/technetwork/pt/articles/java/streams-api-java-8-3410098-ptb.html

Pipeline: operações em streams retornam novas streams. Então é possível
criar uma cadeia de operações (fluxo de processamento).

O pipeline é composto por zero ou mais operações intermediárias e
uma terminal.

Operações intermediárias:

• filter

• map

• flatmap

• peek

• distinct

• sorted

• skip

• limit (*)
* short-circuit

Operações terminais

• forEach

• forEachOrdered

• toArray

• reduce

• collect

• min

• max

• count

• anyMatch (*)
* short-circuit

• allMatch (*)
* short-circuit

• noneMatch (*)
* short-circuit

• findFirst (*)
* short-circuit

• findAny (*)
* short-circuit