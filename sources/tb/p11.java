package tb;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.MainUpdateData;
import tb.yjv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p11 implements agb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25805a;
    public yjv.a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final p11 f25806a = new p11();

        static {
            t2o.a(953155586);
        }

        public static /* synthetic */ p11 access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p11) ipChange.ipc$dispatch("860aa809", new Object[0]);
            }
            return f25806a;
        }
    }

    static {
        t2o.a(953155585);
        t2o.a(950009862);
    }

    public static p11 getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p11) ipChange.ipc$dispatch("d6b202a4", new Object[0]);
        }
        return a.access$000();
    }

    public void addPatchListener(yjv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7d4c33", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // tb.agb
    public hdt installApk(JSON json, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hdt) ipChange.ipc$dispatch("58dc872", new Object[]{this, json, new Boolean(z), new Boolean(z2)});
        }
        if (this.f25805a) {
            hdt hdtVar = new hdt();
            hdtVar.errorMsg = "正在更新中...";
            hdtVar.errorCode = -20;
            return hdtVar;
        }
        hdt hdtVar2 = null;
        try {
            this.f25805a = true;
            MainUpdateData mainUpdateData = (MainUpdateData) nkv.toJavaObject(json, MainUpdateData.class);
            String jSONString = JSON.toJSONString(mainUpdateData);
            Log.e("main_update", "fromPop:" + z2 + ", data:" + jSONString);
            yjv.a aVar = this.b;
            if (aVar != null) {
                aVar.patchStart();
            }
            hdtVar2 = new com.taobao.update.apk.a().execute(z, z2, mainUpdateData);
            if (hdtVar2 == null || !hdtVar2.success) {
                yjv.a aVar2 = this.b;
                if (aVar2 != null) {
                    aVar2.patchFailed(hdtVar2.errorMsg);
                }
            } else {
                kjv.getInstance().clearCache();
                yjv.a aVar3 = this.b;
                if (aVar3 != null) {
                    aVar3.patchSuccess();
                }
            }
        } finally {
            try {
                return hdtVar2;
            } finally {
            }
        }
        return hdtVar2;
    }
}
