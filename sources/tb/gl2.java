package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.widget.broadcast.BroadcastMsg;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class gl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, tl2> f20066a = new HashMap<>();
    public final ArrayList<BroadcastMsg> b = new ArrayList<>();

    static {
        t2o.a(852492308);
    }

    public gl2(String str) {
        ckf.g(str, "channelToken");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f20066a.clear();
        this.b.clear();
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.f20066a.isEmpty();
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("835a2933", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "memberInstanceId");
        if (!this.f20066a.containsKey(str)) {
            return false;
        }
        this.f20066a.remove(str);
        return true;
    }

    public final boolean d(tl2 tl2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("510a680c", new Object[]{this, tl2Var})).booleanValue();
        }
        ckf.g(tl2Var, "member");
        String a2 = tl2Var.a();
        if (this.f20066a.containsKey(a2)) {
            return false;
        }
        this.f20066a.put(a2, tl2Var);
        if (!this.b.isEmpty()) {
            tl2Var.b(this.b);
        }
        return true;
    }

    public final boolean e(String str, BroadcastMsg broadcastMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e17275b2", new Object[]{this, str, broadcastMsg})).booleanValue();
        }
        ckf.g(str, "instanceId");
        ckf.g(broadcastMsg, "msg");
        if (!this.f20066a.containsKey(str)) {
            return false;
        }
        this.b.add(broadcastMsg);
        ArrayList<BroadcastMsg> arrayList = new ArrayList<>(1);
        arrayList.add(broadcastMsg);
        for (tl2 tl2Var : this.f20066a.values()) {
            if (!TextUtils.equals(tl2Var.a(), str)) {
                tl2Var.b(arrayList);
            }
        }
        return true;
    }
}
