package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.web.NetworkUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z3a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public ArrayList<String> c;
    public View e;
    public HashMap<String, String> f;
    public HashMap<String, String> g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32510a = false;
    public ArrayList<String> d = new ArrayList<>();

    static {
        t2o.a(912262988);
    }

    public z3a() {
        NetworkUtils.c();
    }

    public void a(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdb2eed", new Object[]{this, arrayList});
        } else {
            this.c = arrayList;
        }
    }
}
