package tb;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class crf implements qmi<Object> {
    public static final crf INSTANCE = new crf();

    static {
        t2o.a(945815762);
        t2o.a(945815765);
    }

    @Override // tb.qmi
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(jqq.INSTANCE.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // tb.qmi
    public ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = prf.b(obj);
        if (b instanceof String) {
            return jqq.INSTANCE.b(JSONObject.quote((String) b));
        }
        return jqq.INSTANCE.b(b.toString());
    }

    public static void c() {
    }
}
