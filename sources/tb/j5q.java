package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.SmartLayerDXTemplateProcessor;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j5q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartCommonRightsReceiver";

    /* renamed from: a  reason: collision with root package name */
    public final SmartLayerDXTemplateProcessor f21781a;
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements stk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.stk
        public void a(jkd jkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fee1131", new Object[]{this, jkdVar});
                return;
            }
            SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor = j5q.this.f21781a;
            if (!(smartLayerDXTemplateProcessor == null || smartLayerDXTemplateProcessor.mLayerController == null)) {
                p6q.c(SmartLayerConstant$SmartLayerStage.SMART_AWARD, smartLayerDXTemplateProcessor.mConfig, "follow", "关注成功");
                a1u.a(j5q.this.f21781a.mLayerController.j(), "关注成功");
            }
            j5q.this.a();
        }

        @Override // tb.stk
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor = j5q.this.f21781a;
            if (smartLayerDXTemplateProcessor != null) {
                p6q.c(SmartLayerConstant$SmartLayerStage.SMART_AWARD, smartLayerDXTemplateProcessor.mConfig, "follow", "关注失败");
            }
            j5q.this.a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements drd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.drd
        public void a(SmartLayerViewModel smartLayerViewModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4d19433", new Object[]{this, smartLayerViewModel, str});
                return;
            }
            j5q.this.b = false;
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_AWARD, smartLayerViewModel != null ? smartLayerViewModel.mSmartConfig : null, "doAward", "权益领取成功：");
            SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor = j5q.this.f21781a;
            if (smartLayerDXTemplateProcessor != null) {
                smartLayerDXTemplateProcessor.isReceiving = false;
                smartLayerDXTemplateProcessor.processAwardStage();
            }
        }

        @Override // tb.drd
        public void b(SmartLayerViewModel smartLayerViewModel, String str, String str2, String str3) {
            g6q g6qVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c6ba852", new Object[]{this, smartLayerViewModel, str, str2, str3});
                return;
            }
            if (smartLayerViewModel == null || (g6qVar = smartLayerViewModel.mSmartConfig) == null) {
                g6qVar = null;
            }
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_AWARD;
            p6q.c(smartLayerConstant$SmartLayerStage, g6qVar, "doAward", "请求权益失败，返回结果：" + str2 + ", " + str3);
            j5q j5qVar = j5q.this;
            j5qVar.b = false;
            SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor = j5qVar.f21781a;
            if (smartLayerDXTemplateProcessor != null && smartLayerDXTemplateProcessor.mLayerController != null) {
                smartLayerDXTemplateProcessor.isReceiving = false;
                smartLayerDXTemplateProcessor.refreshTemplate();
                a1u.a(j5q.this.f21781a.mLayerController.j(), "领取失败，请重试");
            }
        }
    }

    static {
        t2o.a(295699777);
    }

    public j5q(SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor) {
        this.f21781a = smartLayerDXTemplateProcessor;
    }

    public void c(Object[] objArr) {
        l6q l6qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add91107", new Object[]{this, objArr});
            return;
        }
        SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor = this.f21781a;
        if (smartLayerDXTemplateProcessor == null || (l6qVar = smartLayerDXTemplateProcessor.mSmartContext) == null) {
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_AWARD, null, "receive", "mTemplatePlugin为空");
            return;
        }
        SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_AWARD;
        l6qVar.e(smartLayerConstant$SmartLayerStage);
        SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor2 = this.f21781a;
        b7q.e(smartLayerDXTemplateProcessor2.mConfig, smartLayerDXTemplateProcessor2.mSmartContext, smartLayerConstant$SmartLayerStage, SmartLayerConstant$SmartLayerStage.SMART_SHOW, null);
        b(objArr);
    }

    public void a() {
        SmartLayerViewModel smartLayerViewModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7958819", new Object[]{this});
            return;
        }
        SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor = this.f21781a;
        if (smartLayerDXTemplateProcessor == null || (smartLayerViewModel = smartLayerDXTemplateProcessor.mViewModel) == null) {
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_AWARD, null, "doAward", "mTemplatePlugin为");
        } else if (this.b) {
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_AWARD, smartLayerDXTemplateProcessor.mConfig, "doAward", "正在领取中");
        } else {
            this.b = true;
            smartLayerViewModel.loadAward(new b());
        }
    }

    public void b(Object[] objArr) {
        SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16e53ae", new Object[]{this, objArr});
            return;
        }
        SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor2 = this.f21781a;
        if (smartLayerDXTemplateProcessor2 != null) {
            smartLayerDXTemplateProcessor2.isReceiving = true;
            smartLayerDXTemplateProcessor2.refreshTemplate();
        }
        if (objArr == null || objArr.length <= 0) {
            a();
            return;
        }
        String valueOf = String.valueOf(objArr[0]);
        String str = "";
        String valueOf2 = objArr.length > 1 ? String.valueOf(objArr[1]) : str;
        if (!TextUtils.equals(valueOf, "needFollow") || (smartLayerDXTemplateProcessor = this.f21781a) == null || smartLayerDXTemplateProcessor.mSmartContext == null) {
            a();
            return;
        }
        SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_AWARD;
        p6q.c(smartLayerConstant$SmartLayerStage, smartLayerDXTemplateProcessor.mConfig, "follow", "开始触发关注");
        VideoInfo videoInfo = this.f21781a.mSmartContext.o;
        qt9 qt9Var = new qt9();
        if (videoInfo != null) {
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                str = accountInfo.accountId;
            }
            qt9Var.f26917a = str;
            qt9Var.c = videoInfo.liveId;
            if (accountInfo != null) {
                qt9Var.b = accountInfo.type;
            }
        } else {
            l6q l6qVar = this.f21781a.mSmartContext;
            qt9Var.f26917a = l6qVar.c;
            qt9Var.c = l6qVar.e;
        }
        qt9Var.o = valueOf2;
        if (v2s.o().k().e(qt9Var)) {
            p6q.c(smartLayerConstant$SmartLayerStage, this.f21781a.mConfig, "follow", "已经是关注态");
            a();
            return;
        }
        v2s.o().k().f(qt9Var, new a());
    }
}
