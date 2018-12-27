package com.hash_map_test;

public class CustomMap<K, V> {
    private Entry<K, V>[] table = new Entry[16];
    /* задаем главный массив, в котором и будем хранить данные */

    public void put(K key, V value) {
        int newHash = newHashGenerator(key); // генерируем псевдослучайное значение, используя ключ
        int index = indexFor(newHash); 		//	table.length - с учетом размера массива
        Entry<K, V> entry = table[index];
        if (entry == null) {
            Entry<K, V> newEntry = new Entry<K, V>(key, value, newHash, null);
            table[index] = newEntry;
            // просто кладем значение в ячейку, если оно null
        }

        //todo

        /*
        * В качестве дз:
        * реализуйте, чтобы добавлялись значения мапу,
        * если она пришла в ячейку, а она занята.
        * Это было обговорено в начале занятия.
        *
        * Подсказка:
        * когда мы пришли в ячейку и видим, что она занята,
        * то смотрим в nextEntry , если оно тоже занято,
        * то смотрим уже этого Entry его nextEntry.
        * И так по циклу пока не дойдем, что nextEntry = null.
        * Тогда вписываем туда наше значение
        * */
    }

    private int indexFor(int newHash) {
        return newHash & (table.length - 1);
        /* используем побитовое И для получения нужного нам индекса */

    }

    private int newHashGenerator(K key) {
        int hash = key.hashCode();
        hash = hash ^ hash >>> 20 ^ hash >>> 12;
        return hash ^ hash >>> 7 ^ hash >>> 3;
        //  генерируем рандомное значение, используя ключ. Здесь можете поэкспериментировать
    }

    private V get(K key){
        // todo Реализуйте get, который делается также, как и put
        return null;
    }

    private class Entry<K, V> {
        private K key;
        private V value;
        private int hash; 					// просто числовое значение. Не путать с hash-кодом!
        private Entry<K, V> nextEntry; // следуещее Entry, которое идет после него

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    ", hash=" + hash +
                    ", nextEntry=" + nextEntry +
                    '}';
        }

        public Entry(K key, V value, int hash, Entry<K, V> nextEntry) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.nextEntry = nextEntry;
        }

        public K getKey() {

            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public int getHash() {
            return hash;
        }

        public void setHash(int hash) {
            this.hash = hash;
        }

        public Entry<K, V> getnextEntry() {
            return nextEntry;
        }

        public void setnextEntry(Entry<K, V> nextEntry) {
            this.nextEntry = nextEntry;
        }
    }
}