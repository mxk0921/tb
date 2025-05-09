package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import org.json.alipay.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class xqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f31546a;

    public xqf() {
        this.f31546a = new ArrayList();
    }

    public Object a(int i) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        Object d = d(i);
        if (d != null) {
            return d;
        }
        throw new JSONException("JSONArray[" + i + "] not found.");
    }

    public String b(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("462415c5", new Object[]{this, str});
        }
        int c = c();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < c; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(erf.j(this.f31546a.get(i)));
        }
        return stringBuffer.toString();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        return this.f31546a.size();
    }

    public Object d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b0f011c9", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= c()) {
            return null;
        }
        return this.f31546a.get(i);
    }

    public xqf e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xqf) ipChange.ipc$dispatch("37c1077b", new Object[]{this, obj});
        }
        this.f31546a.add(obj);
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        try {
            return "[" + b(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }

    public xqf(orf orfVar) throws JSONException {
        this();
        char c;
        char d;
        char d2 = orfVar.d();
        if (d2 == '[') {
            c = ']';
        } else if (d2 == '(') {
            c = ')';
        } else {
            throw orfVar.g("A JSONArray text must start with '['");
        }
        if (orfVar.d() != ']') {
            orfVar.a();
            while (true) {
                if (orfVar.d() == ',') {
                    orfVar.a();
                    this.f31546a.add(null);
                } else {
                    orfVar.a();
                    this.f31546a.add(orfVar.f());
                }
                d = orfVar.d();
                if (d == ')') {
                    break;
                } else if (d == ',' || d == ';') {
                    if (orfVar.d() != ']') {
                        orfVar.a();
                    } else {
                        return;
                    }
                } else if (d != ']') {
                    throw orfVar.g("Expected a ',' or ']'");
                }
            }
            if (c != d) {
                throw orfVar.g("Expected a '" + new Character(c) + "'");
            }
        }
    }

    public xqf(String str) throws JSONException {
        this(new orf(str));
    }

    public xqf(Collection collection) {
        this.f31546a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public xqf(Object obj) throws JSONException {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                e(Array.get(obj, i));
            }
            return;
        }
        throw new JSONException("JSONArray initial value should be a string or collection or array.");
    }
}
