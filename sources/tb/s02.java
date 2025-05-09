package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.ui.engine.weex.b;
import com.taobao.tao.channel.ChannelProvider;
import com.taobao.tao.log.TLog;
import com.taobao.tao.sharepanel.normal.NativeSharePanel;
import com.taobao.tao.util.AnalyticsUtil;
import com.ut.share.business.ShareBusiness;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class s02 implements opd, ChannelProvider.c, b.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String TAG = "BaseSharePanel";
    private b.AbstractC0665b mDowngradeListener;
    private boolean mIsHasInitConfigData;
    public whp mShareActionDispatcher;
    public rip mShareContext;
    public com.taobao.share.ui.engine.render.b mSharePanel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements b.AbstractC0665b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f27708a;
        public final /* synthetic */ TBShareContent b;

        public a(ArrayList arrayList, TBShareContent tBShareContent) {
            this.f27708a = arrayList;
            this.b = tBShareContent;
        }

        @Override // com.taobao.share.ui.engine.weex.b.AbstractC0665b
        public void onDowngrade() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("877656dd", new Object[]{this});
                return;
            }
            com.taobao.share.ui.engine.render.b bVar = s02.this.mSharePanel;
            if (bVar != null) {
                bVar.b();
            }
            new NativeSharePanel().renderSharePanel(this.f27708a, this.b);
        }
    }

    static {
        t2o.a(666894543);
        t2o.a(665845799);
        t2o.a(666894373);
        t2o.a(667942974);
    }

    @Override // com.taobao.share.ui.engine.weex.b.c
    public b.AbstractC0665b getDowngradeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.AbstractC0665b) ipChange.ipc$dispatch("e20e7031", new Object[]{this});
        }
        return this.mDowngradeListener;
    }

    public com.taobao.share.ui.engine.render.b getPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.share.ui.engine.render.b) ipChange.ipc$dispatch("d81fb47", new Object[]{this});
        }
        return this.mSharePanel;
    }

    public whp getShareActionDispatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("ac1a97e1", new Object[]{this});
        }
        return this.mShareActionDispatcher;
    }

    public abstract void initPanelData(TBShareContent tBShareContent, li3 li3Var, String str, int i, boolean z, String str2, String str3, String str4);

    public abstract void initSharePanel(Activity activity);

    @Override // com.taobao.tao.channel.ChannelProvider.c
    public void onConfigData(TBShareContent tBShareContent, li3 li3Var, String str, int i, boolean z, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70378cc", new Object[]{this, tBShareContent, li3Var, str, new Integer(i), new Boolean(z), str2, str3, str4});
            return;
        }
        ShareBusiness.sShareUTArgs.put(ShareBusiness.BIZ_CONFIG_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        oj8.d().b();
        fwr.b("TIMECOST", "biz_config_end: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
        if (!this.mIsHasInitConfigData) {
            this.mIsHasInitConfigData = true;
            long currentTimeMillis = System.currentTimeMillis();
            tBShareContent.activityUrl = TextUtils.isEmpty(str4) ? "" : str4;
            this.mShareContext.c(tBShareContent);
            AnalyticsUtil.traceShowShareView(tBShareContent);
            kkp.e().a(kkp.KEY_SHAREPANELGETSHARECONFIGEND);
            initPanelData(tBShareContent, li3Var, str, i, z, str2, str3, str4);
            AnalyticsUtil.tracePopupEvent(tBShareContent, System.currentTimeMillis() - currentTimeMillis);
        }
    }

    @Override // tb.opd
    public void renderSharePanel(ArrayList<String> arrayList, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352e7b25", new Object[]{this, arrayList, tBShareContent});
            return;
        }
        Activity shareActivity = ShareBusiness.getInstance().getShareActivity();
        if (shareActivity == null) {
            shareActivity = ClipUrlWatcherControl.z().s().get();
        }
        if (tBShareContent == null || shareActivity == null) {
            TLog.loge("BaseSharePanel", "return doShared : content or activity is null");
            return;
        }
        this.mShareActionDispatcher = new whp();
        rip ripVar = new rip();
        this.mShareContext = ripVar;
        ripVar.d(this.mShareActionDispatcher);
        this.mShareContext.c(tBShareContent);
        this.mDowngradeListener = new a(arrayList, tBShareContent);
        initSharePanel(shareActivity);
        bwr.h().t(true);
    }
}
