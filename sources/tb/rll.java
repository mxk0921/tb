package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class rll extends e8g implements q3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final FrameLayout f;
    public final c8g g;
    public final List<k8m> h;

    static {
        t2o.a(511705493);
        t2o.a(511705486);
    }

    public rll(Context context, FrameLayout frameLayout, d8g d8gVar) {
        this.h = new ArrayList();
        this.f = frameLayout;
        if (d8gVar != null) {
            this.g = d8gVar.a();
        } else {
            this.g = O(context);
        }
        G(this.g);
        N();
        S();
    }

    public static /* synthetic */ Object ipc$super(rll rllVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/PageContainer");
    }

    @Override // tb.e8g
    public void J(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            ((k8m) it.next()).J(i, i2, intent);
        }
    }

    public void M(k8m k8mVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d1dc77", new Object[]{this, k8mVar, str});
            return;
        }
        k8mVar.M(this.f);
        this.h.add(k8mVar);
        k8mVar.P(str);
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc9adbf", new Object[]{this});
        } else {
            v8m.a(new uay());
        }
    }

    public c8g O(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8g) ipChange.ipc$dispatch("eda6b4a9", new Object[]{this, context});
        }
        return c8g.G(context);
    }

    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "undefine";
    }

    public FrameLayout Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("a43a0f68", new Object[]{this});
        }
        return this.f;
    }

    public List<k8m> R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("10bbb7e5", new Object[]{this});
        }
        return this.h;
    }

    public abstract void S();

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            ((k8m) it.next()).U();
        }
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            ((k8m) it.next()).V();
        }
    }

    public void V() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628eeae4", new Object[]{this});
            return;
        }
        UGCVideo o = muu.o(this.d);
        if (!(o == null || o.getMeta("mediaStatInfo") == null)) {
            MediaStatInfo mediaStatInfo = (MediaStatInfo) o.getMeta("mediaStatInfo");
            if (!TextUtils.isEmpty(mediaStatInfo.album_film_template)) {
                hashMap = new HashMap();
                hashMap.put("t_id", mediaStatInfo.album_film_template);
                s().d(this.d, hashMap);
            }
        }
        hashMap = null;
        s().d(this.d, hashMap);
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            ((k8m) it.next()).W();
        }
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            ((k8m) it.next()).Z();
        }
        V();
    }

    @Override // tb.q3e
    public <T extends q3e> T d(String str) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((q3e) ipChange.ipc$dispatch("ff1b39be", new Object[]{this, str}));
        }
        if (TextUtils.equals(str, "undefine")) {
            return null;
        }
        if (TextUtils.equals(str, P())) {
            return this;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            k8m k8mVar = (k8m) it.next();
            if (k8mVar != null && (t = (T) k8mVar.d(str)) != null) {
                return t;
            }
        }
        return null;
    }

    @Override // tb.q3e
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.e8g, tb.b8g
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            this.g.y();
        }
    }

    public rll(FrameLayout frameLayout, d8g d8gVar) {
        this(null, frameLayout, d8gVar);
    }
}
