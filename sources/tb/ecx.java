package tb;

import android.graphics.Bitmap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.ClickArea;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ecx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f18485a;
    public List<ClickArea> b;
    public JSONObject c;
    public long d;
    public Bitmap e;

    static {
        t2o.a(436207624);
    }

    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b840ebd2", new Object[]{this});
        }
        return this.e;
    }

    public List<ClickArea> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c61bdd8c", new Object[]{this});
        }
        return this.b;
    }

    public Bitmap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a558ea1a", new Object[]{this});
        }
        return this.f18485a;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("538de1e", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b58c323d", new Object[]{this});
        }
        return this.c;
    }

    public void f(List<ClickArea> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36ba58", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public void g(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c847d7e", new Object[]{this, bitmap});
        } else {
            this.f18485a = bitmap;
        }
    }

    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c368ce6", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8138d3e7", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public void j(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969cb2c6", new Object[]{this, bitmap});
        } else {
            this.e = bitmap;
        }
    }
}
