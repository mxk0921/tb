package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ikk implements iik {

    /* renamed from: a  reason: collision with root package name */
    public static final ikk f21365a = new ikk();

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
        String str;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.util.regex.Pattern")) {
            str = ((Pattern) obj).pattern();
        } else if (!name.equals("net.sf.json.JSONNull")) {
            if (!name.equals("java.net.Inet6Address")) {
                if (name.equals("com.fasterxml.jackson.databind.node.ArrayNode")) {
                    String obj3 = obj.toString();
                    if (jSONWriter.D0()) {
                        jSONWriter.g2(obj3.getBytes(StandardCharsets.UTF_8));
                        return;
                    } else {
                        jSONWriter.f2(obj3);
                        return;
                    }
                } else if (!name.equals("java.net.Inet4Address")) {
                    if (name.equals("java.text.SimpleDateFormat")) {
                        str = ((SimpleDateFormat) obj).toPattern();
                    } else if (name.equals("java.net.InetSocketAddress")) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                        jSONWriter.e1();
                        jSONWriter.W1(WXAddressModule2.PLUGIN_NAME);
                        jSONWriter.s1();
                        jSONWriter.j1(inetSocketAddress.getAddress());
                        jSONWriter.W1("port");
                        jSONWriter.s1();
                        jSONWriter.L1(inetSocketAddress.getPort());
                        jSONWriter.g();
                        return;
                    } else {
                        throw new JSONException("not support class : ".concat(name));
                    }
                }
            }
            str = ((InetAddress) obj).getHostName();
        } else {
            jSONWriter.b2();
            return;
        }
        jSONWriter.k2(str);
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
