package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.e3b;
import tb.qy8;
import tb.t2o;
import tb.vfm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TbPopLayerBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> c = new ArrayList(4);

    /* renamed from: a  reason: collision with root package name */
    public boolean f10791a = true;
    public final Set<e3b> b = new HashSet(8);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<ArrayList<String>> {
        public a(TbPopLayerBroadcastReceiver tbPopLayerBroadcastReceiver) {
        }
    }

    static {
        t2o.a(491782608);
    }

    public static /* synthetic */ Object ipc$super(TbPopLayerBroadcastReceiver tbPopLayerBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/pop/lifecycle/TbPopLayerBroadcastReceiver");
    }

    public void a(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30978b00", new Object[]{this, e3bVar});
        } else if (e3bVar != null) {
            ((HashSet) this.b).add(e3bVar);
            c(e3bVar);
        }
    }

    public final void c(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6894aa71", new Object[]{this, e3bVar});
        } else if (this.f10791a) {
            e3bVar.j().s();
        } else {
            e3bVar.j().t();
        }
    }

    public void d(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef7aef63", new Object[]{this, e3bVar});
        } else if (e3bVar != null) {
            ((HashSet) this.b).remove(e3bVar);
        }
    }

    public final List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("52849d3e", new Object[]{this});
        }
        try {
            String e = qy8.b.e("homepage_switch", "popLayerTypeFilterList", null);
            if (TextUtils.isEmpty(e)) {
                return c;
            }
            return (List) JSON.parseObject(e, new a(this), new Feature[0]);
        } catch (Throwable unused) {
            return c;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && intent.getAction() != null) {
            String stringExtra = intent.getStringExtra("layerType");
            String action = intent.getAction();
            vfm.c("PopLayerBroadcastReceiver ", "onReceive pop broadcast, action=" + action + ", layerType=" + stringExtra);
            if (b().contains(stringExtra)) {
                action.hashCode();
                if (action.equals(PopLayer.ACTION_OUT_DISPLAY)) {
                    this.f10791a = false;
                } else if (action.equals(PopLayer.ACTION_OUT_DISMISS)) {
                    this.f10791a = true;
                }
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    c((e3b) it.next());
                }
            }
        }
    }
}
