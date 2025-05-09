package tb;

import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.norm.IModuleSwitchAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tbpoplayer.watermask.PopWaterMaskView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qyi implements IModuleSwitchAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f27006a = new AtomicBoolean(false);
    public boolean b = false;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final qyi f27007a = new qyi();

        static {
            t2o.a(790626339);
        }

        public static /* synthetic */ qyi a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qyi) ipChange.ipc$dispatch("af699387", new Object[0]);
            }
            return f27007a;
        }
    }

    static {
        t2o.a(790626338);
        t2o.a(625999973);
    }

    public static qyi a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qyi) ipChange.ipc$dispatch("2f16df6c", new Object[0]);
        }
        return a.a();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public float getBigScreenAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e805bd4", new Object[]{this})).floatValue();
        }
        try {
            return Float.parseFloat(a9l.w().e());
        } catch (Throwable th) {
            wdm.h("getBigScreenAspectRatio.error", th);
            return 0.0f;
        }
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public int getFetchOnPageSwitchTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("268cc65a", new Object[]{this})).intValue();
        }
        return (int) a9l.w().f();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean ignoreViewType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed37346", new Object[]{this, str})).booleanValue();
        }
        return PopWaterMaskView.VIEW_TYPE.equals(str);
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean interruptDownAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("945fa746", new Object[]{this})).booleanValue();
        }
        return a9l.w().x();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isCleanKeepDirectlyEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5129cae8", new Object[]{this})).booleanValue();
        }
        return a9l.w().y();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isConfigFetchLocalEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45aeb36b", new Object[]{this})).booleanValue();
        }
        if (this.c.compareAndSet(false, true)) {
            this.d = a9l.w().b();
        }
        return this.d;
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isConfigFetchOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("796b2533", new Object[]{this})).booleanValue();
        }
        if (this.f27006a.compareAndSet(false, true)) {
            this.b = a9l.w().a();
        }
        return this.b;
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isFatigueFilterEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f303f683", new Object[]{this})).booleanValue();
        }
        return a9l.w().C();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isInterceptHover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47bc9bef", new Object[]{this})).booleanValue();
        }
        return a9l.w().D();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isNewNativeEventNotificationEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19677b06", new Object[]{this})).booleanValue();
        }
        return a9l.w().H();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isOpenImmersiveByDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f371762e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isPreDealTriggerEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72ea49c1", new Object[]{this})).booleanValue();
        }
        return a9l.w().K();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isRecordBucketId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcd8c6b", new Object[]{this})).booleanValue();
        }
        return a9l.w().L();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isRequestingFilterEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("843b7003", new Object[]{this})).booleanValue();
        }
        return a9l.w().N();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean isUseNewActionLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16d9e618", new Object[]{this})).booleanValue();
        }
        return a9l.w().P();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean removeConfigUpdateNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7806a03", new Object[]{this})).booleanValue();
        }
        return a9l.w().M();
    }

    @Override // com.alibaba.poplayer.norm.IModuleSwitchAdapter
    public boolean usePopReadyApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b25faec", new Object[]{this})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(PopLayer.getReference().getApp(), "android_poplayer_page_ready_api");
    }
}
