package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWNetworkAdapter;
import com.taobao.media.MediaSystemUtils;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.v75;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nar extends v75 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends v75.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(451936292);
        }

        public a(Activity activity) {
            super(activity);
            if (MediaSystemUtils.sApplication == null) {
                MediaSystemUtils.sApplication = activity.getApplication();
                MediaSystemUtils.sApplication = activity.getApplication();
            }
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/TBDWGifInstance$TBBuilder");
        }

        public nar l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nar) ipChange.ipc$dispatch("f7323ec2", new Object[]{this});
            }
            return new nar(this.f29826a);
        }
    }

    static {
        t2o.a(451936291);
        h95.a();
        r65.f27136a = new m75();
    }

    public nar(v75.e eVar) {
        super(eVar);
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_TBDWGifInstance);
    }

    public static /* synthetic */ Object ipc$super(nar narVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/TBDWGifInstance");
    }

    @Override // tb.v75
    public void q(v75.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a3e8d3", new Object[]{this, eVar});
        } else if (eVar != null) {
            this.d.mConfigAdapter = new b75();
            this.d.mConfigParamsAdapter = new d75();
            this.d.mNetworkAdapter = new DWNetworkAdapter();
            this.d.mUTAdapter = new z95();
            this.d.mDWAlarmAdapter = new k95();
            this.d.mDWImageAdapter = new z75(this.d.getActivity());
        }
    }
}
