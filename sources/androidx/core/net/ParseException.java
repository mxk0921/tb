package androidx.core.net;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ParseException extends RuntimeException {
    public final String response;

    public ParseException(String str) {
        super(str);
        this.response = str;
    }
}
