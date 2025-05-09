package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.FieldWriter;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wtf implements iik {
    @Override // tb.iik
    public /* synthetic */ void B(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.i(this, jSONWriter, obj, obj2, type, j);
        throw null;
    }

    @Override // tb.iik
    public /* synthetic */ void C(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.e(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // tb.iik
    public /* synthetic */ FieldWriter E(long j) {
        return null;
    }

    @Override // tb.iik
    public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.g(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // tb.iik
    public /* synthetic */ void k(JSONWriter jSONWriter, Object obj) {
        hik.d(this, jSONWriter, obj);
    }

    @Override // tb.iik
    public /* synthetic */ void l(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.f(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // tb.iik
    public /* synthetic */ boolean n(JSONWriter jSONWriter) {
        return hik.b(this, jSONWriter);
    }

    @Override // tb.iik
    public /* synthetic */ List p() {
        return hik.a(this);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        try {
            jSONWriter.j2(((Clob) obj).getCharacterStream());
        } catch (SQLException e) {
            throw new JSONException("get getCharacterStream error", e);
        }
    }

    @Override // tb.iik
    public /* synthetic */ void A(e1n e1nVar) {
    }

    @Override // tb.iik
    public /* synthetic */ void c(h1n h1nVar) {
    }

    @Override // tb.iik
    public /* synthetic */ void f(qij qijVar) {
    }

    @Override // tb.iik
    public /* synthetic */ void g(y1w y1wVar) {
    }
}
