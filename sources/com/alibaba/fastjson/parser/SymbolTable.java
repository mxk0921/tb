package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SymbolTable {
    private final int indexMask;
    private final Entry[] symbols;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Entry {
        final char[] chars;
        final int hashCode;
        final String value;

        public Entry(String str, int i) {
            this.value = str;
            this.chars = str.toCharArray();
            this.hashCode = i;
        }
    }

    public SymbolTable(int i) {
        this.indexMask = i - 1;
        this.symbols = new Entry[i];
        addSymbol("$ref", 0, 4, 1185263);
        addSymbol(JSON.DEFAULT_TYPE_KEY, 0, 5, 62680954);
    }

    private static String subString(String str, int i, int i2) {
        char[] cArr = new char[i2];
        str.getChars(i, i2 + i, cArr, 0);
        return new String(cArr);
    }

    public String addSymbol(char[] cArr, int i, int i2, int i3) {
        int i4 = this.indexMask & i3;
        Entry entry = this.symbols[i4];
        if (entry != null) {
            if (i3 == entry.hashCode && i2 == entry.chars.length) {
                for (int i5 = 0; i5 < i2; i5++) {
                    if (cArr[i + i5] == entry.chars[i5]) {
                    }
                }
                return entry.value;
            }
            return new String(cArr, i, i2);
        }
        String intern = new String(cArr, i, i2).intern();
        this.symbols[i4] = new Entry(intern, i3);
        return intern;
    }

    public String addSymbol(String str, int i, int i2, int i3) {
        int i4 = this.indexMask & i3;
        Entry entry = this.symbols[i4];
        if (entry == null) {
            if (i2 != str.length()) {
                str = subString(str, i, i2);
            }
            String intern = str.intern();
            this.symbols[i4] = new Entry(intern, i3);
            return intern;
        } else if (i3 == entry.hashCode && i2 == entry.chars.length && str.regionMatches(i, entry.value, 0, i2)) {
            return entry.value;
        } else {
            return subString(str, i, i2);
        }
    }
}
