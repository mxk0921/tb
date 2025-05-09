package com.alibaba.android.ultron.vfw.viewholder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import tb.hav;
import tb.t2o;
import tb.ujt;
import tb.wo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UltronDXViewTypeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sBroadcastActionDXButterDowngrade = "ultron.dx.downgrade";
    public static final String sBroadcastKeyBizCode = "bizCode";

    /* renamed from: a  reason: collision with root package name */
    public ViewEngine f2350a;
    public int b = 0;
    public final ArrayMap<String, Integer> c = new ArrayMap<>();
    public final ArrayMap<Integer, DXTemplateItem> d = new ArrayMap<>();
    public final ArrayMap<Integer, ArrayList<IDMComponent>> e = new ArrayMap<>();
    public BroadcastReceiver f;

    static {
        t2o.a(157286757);
    }

    public UltronDXViewTypeManager(ViewEngine viewEngine, boolean z) {
        this.f2350a = viewEngine;
        if (z) {
            g(viewEngine);
        }
    }

    public static /* synthetic */ ArrayMap a(UltronDXViewTypeManager ultronDXViewTypeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("192ae457", new Object[]{ultronDXViewTypeManager});
        }
        return ultronDXViewTypeManager.c;
    }

    public static /* synthetic */ ArrayMap b(UltronDXViewTypeManager ultronDXViewTypeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("5c915398", new Object[]{ultronDXViewTypeManager});
        }
        return ultronDXViewTypeManager.e;
    }

    public void c() {
        ViewEngine viewEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            if (!(this.f == null || (viewEngine = this.f2350a) == null)) {
                LocalBroadcastManager.getInstance(viewEngine.K()).unregisterReceiver(this.f);
                this.f = null;
            }
            this.f2350a = null;
        } catch (Throwable unused) {
        }
    }

    public ArrayList<IDMComponent> d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("68848254", new Object[]{this, new Integer(i)});
        }
        return this.e.get(Integer.valueOf(i));
    }

    public DXTemplateItem e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("d69104ac", new Object[]{this, new Integer(i)});
        }
        return this.d.get(Integer.valueOf(i));
    }

    public final void g(final ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7de442", new Object[]{this, viewEngine});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(sBroadcastActionDXButterDowngrade);
        this.f = new BroadcastReceiver() { // from class: com.alibaba.android.ultron.vfw.viewholder.UltronDXViewTypeManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/viewholder/UltronDXViewTypeManager$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Bundle extras;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    extras = intent.getExtras();
                } catch (Throwable th) {
                    hav.b("UltronDXViewTypeManager", "downgrade,", th.getMessage());
                }
                if (extras != null) {
                    String string = extras.getString("bizCode", null);
                    String I = viewEngine.I();
                    if (!TextUtils.isEmpty(string) && string.equals(I)) {
                        UltronDXViewTypeManager.a(UltronDXViewTypeManager.this).clear();
                        UltronDXViewTypeManager.b(UltronDXViewTypeManager.this).clear();
                        viewEngine.z0(127);
                        hav.d("UltronDXViewTypeManager", "降级，清空ItemType");
                    }
                }
            }
        };
        LocalBroadcastManager.getInstance(viewEngine.K()).registerReceiver(this.f, intentFilter);
    }

    public int f(IDMComponent iDMComponent) {
        DXTemplateItem i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d26c6ff8", new Object[]{this, iDMComponent})).intValue();
        }
        ViewEngine viewEngine = this.f2350a;
        if (iDMComponent == null || iDMComponent.getContainerInfo() == null || viewEngine == null || (i = ((wo7) ((ujt) viewEngine.a0(ujt.class)).b(iDMComponent.getContainerType())).i(iDMComponent.getContainerInfo().getString("name"))) == null) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i.f7343a);
        sb.append(i.b);
        if (viewEngine.n0()) {
            try {
                sb.append(viewEngine.H().getData().indexOf(iDMComponent));
            } catch (Exception unused) {
            }
        }
        Integer num = this.c.get(sb.toString());
        if (num == null) {
            int i2 = this.b;
            this.b = 1 + i2;
            num = Integer.valueOf(i2);
            this.c.put(sb.toString(), num);
            this.d.put(num, i);
            ArrayList<IDMComponent> arrayList = new ArrayList<>();
            arrayList.add(iDMComponent);
            this.e.put(num, arrayList);
        } else {
            this.e.get(num).add(iDMComponent);
        }
        return num.intValue();
    }
}
