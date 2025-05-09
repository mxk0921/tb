package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Random;
import tb.bxg;
import tb.cpr;
import tb.cwd;
import tb.fkx;
import tb.htv;
import tb.iw0;
import tb.or;
import tb.p7e;
import tb.r7e;
import tb.szd;
import tb.t2o;
import tb.t54;
import tb.t7e;
import tb.up6;
import tb.ux9;
import tb.v2s;
import tb.yj4;
import tb.ysv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FloatingUserTaskFrame extends BaseFrame implements cpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FloatingUserTaskView mFloatingUserTaskView;
    private boolean mHasDidAppear;
    private String mScene;
    private ysv mUserTaskController;
    private RecyclerView rvParent;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements p7e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f782f0", new Object[]{this});
                return;
            }
            FloatingUserTaskFrame floatingUserTaskFrame = FloatingUserTaskFrame.this;
            TBLiveDataModel tBLiveDataModel = floatingUserTaskFrame.mLiveDataModel;
            if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && FloatingUserTaskFrame.access$000(floatingUserTaskFrame) != null) {
                ysv access$000 = FloatingUserTaskFrame.access$000(FloatingUserTaskFrame.this);
                FloatingUserTaskFrame floatingUserTaskFrame2 = FloatingUserTaskFrame.this;
                VideoInfo videoInfo = floatingUserTaskFrame2.mLiveDataModel.mVideoInfo;
                AccountInfo accountInfo = videoInfo.broadCaster;
                if (accountInfo != null) {
                    str = accountInfo.accountId;
                } else {
                    str = "";
                }
                access$000.V(str, videoInfo.liveId, (t54) floatingUserTaskFrame2.mFrameContext);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements t7e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a963e887", new Object[]{this, new Float(f), new Float(f2)});
            } else if (FloatingUserTaskFrame.access$100(FloatingUserTaskFrame.this) != null) {
                bxg.f16701a = (int) ((((f + (FloatingUserTaskFrame.access$100(FloatingUserTaskFrame.this).getWidth() / 2)) * 1.0f) / iw0.h(FloatingUserTaskFrame.this.mContext)) * 375.0f);
                bxg.b = (int) ((((f2 + (FloatingUserTaskFrame.access$100(FloatingUserTaskFrame.this).getHeight() / 2)) * 1.0f) / iw0.e(FloatingUserTaskFrame.this.mContext)) * 375.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(FloatingUserTaskFrame floatingUserTaskFrame) {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/FloatingUserTaskFrame$3");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1018) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements htv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.htv
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b404df5", new Object[]{this, new Boolean(z)});
                return;
            }
            FloatingUserTaskFrame floatingUserTaskFrame = FloatingUserTaskFrame.this;
            TBLiveDataModel tBLiveDataModel = floatingUserTaskFrame.mLiveDataModel;
            if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
                if (floatingUserTaskFrame.mLandscape) {
                    z = false;
                }
                szd access$200 = FloatingUserTaskFrame.access$200(floatingUserTaskFrame, z);
                if (z && FloatingUserTaskFrame.access$000(FloatingUserTaskFrame.this) != null) {
                    FloatingUserTaskFrame.access$000(FloatingUserTaskFrame.this).D(access$200);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f8725a;

        public e(View view) {
            this.f8725a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View view = this.f8725a;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                bxg.f16701a = (int) ((((iArr[0] + (this.f8725a.getWidth() / 2)) * 1.0f) / iw0.h(FloatingUserTaskFrame.this.mContext)) * 375.0f);
                bxg.b = (int) ((((iArr[1] + (this.f8725a.getHeight() / 2)) * 1.0f) / iw0.e(FloatingUserTaskFrame.this.mContext)) * 375.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FloatingUserTaskFrame.access$300(FloatingUserTaskFrame.this)) {
                FloatingUserTaskFrame.access$400(FloatingUserTaskFrame.this, "onMessageReceived alivemodx-shopping-train appear");
                FloatingUserTaskFrame.access$500(FloatingUserTaskFrame.this);
                FloatingUserTaskFrame.access$600(FloatingUserTaskFrame.this, true);
            }
        }
    }

    static {
        t2o.a(295700077);
        t2o.a(806356196);
    }

    public FloatingUserTaskFrame(Context context, ux9 ux9Var, String str) {
        super(context, ux9Var);
        this.mScene = str;
    }

    public static /* synthetic */ ysv access$000(FloatingUserTaskFrame floatingUserTaskFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ysv) ipChange.ipc$dispatch("39838ff4", new Object[]{floatingUserTaskFrame});
        }
        return floatingUserTaskFrame.mUserTaskController;
    }

    public static /* synthetic */ FloatingUserTaskView access$100(FloatingUserTaskFrame floatingUserTaskFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingUserTaskView) ipChange.ipc$dispatch("8ff78de6", new Object[]{floatingUserTaskFrame});
        }
        return floatingUserTaskFrame.mFloatingUserTaskView;
    }

    public static /* synthetic */ szd access$200(FloatingUserTaskFrame floatingUserTaskFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (szd) ipChange.ipc$dispatch("49800a75", new Object[]{floatingUserTaskFrame, new Boolean(z)});
        }
        return floatingUserTaskFrame.updateUserTask(z);
    }

    public static /* synthetic */ boolean access$300(FloatingUserTaskFrame floatingUserTaskFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c3e9fe9", new Object[]{floatingUserTaskFrame})).booleanValue();
        }
        return floatingUserTaskFrame.mHasDidAppear;
    }

    public static /* synthetic */ void access$400(FloatingUserTaskFrame floatingUserTaskFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2b1d70", new Object[]{floatingUserTaskFrame, str});
        } else {
            floatingUserTaskFrame.loge(str);
        }
    }

    public static /* synthetic */ void access$500(FloatingUserTaskFrame floatingUserTaskFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cc267", new Object[]{floatingUserTaskFrame});
        } else {
            floatingUserTaskFrame.destroy();
        }
    }

    public static /* synthetic */ void access$600(FloatingUserTaskFrame floatingUserTaskFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a7542c", new Object[]{floatingUserTaskFrame, new Boolean(z)});
        } else {
            floatingUserTaskFrame.appear(z);
        }
    }

    private void appear(boolean z) {
        VideoInfo videoInfo;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f126b8", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
            int i = videoInfo.status;
            if ((i == 0 || i == 3) && !up6.q0(this.mFrameContext) && !or.a(this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
                ysv ysvVar = this.mUserTaskController;
                if (ysvVar != null) {
                    VideoInfo videoInfo2 = this.mLiveDataModel.mVideoInfo;
                    String str2 = null;
                    if (videoInfo2 != null) {
                        String str3 = videoInfo2.liveId;
                        AccountInfo accountInfo = videoInfo2.broadCaster;
                        if (accountInfo != null) {
                            str2 = accountInfo.accountId;
                        }
                        str = str3;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (z || ysvVar.S(str2, str)) {
                        this.mUserTaskController.F(up6.r(this.mFrameContext), up6.r(this.mFrameContext), str, str2, this.mLiveDataModel.mInitParams.get(yj4.PARAM_USER_TASK_JSON), true);
                    }
                }
                changeLayoutParams();
                checkUserTask();
            }
        }
    }

    private void changeLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efceada7", new Object[]{this});
            return;
        }
        FloatingUserTaskView floatingUserTaskView = this.mFloatingUserTaskView;
        if (floatingUserTaskView != null) {
            ViewGroup.LayoutParams layoutParams = floatingUserTaskView.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(12);
                layoutParams2.addRule(11);
                if (this.mLandscape) {
                    layoutParams2.bottomMargin = iw0.a(this.mContext, 95.0f);
                } else {
                    layoutParams2.bottomMargin = iw0.a(this.mContext, 300.0f);
                }
                this.mFloatingUserTaskView.setLayoutParams(layoutParams);
            }
        }
    }

    private void checkUserTask() {
        VideoInfo videoInfo;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158db19f", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
            int i = videoInfo.status;
            if ((i == 0 || i == 3) && !up6.q0(this.mFrameContext) && this.mUserTaskController != null) {
                if (this.mFrameContext.D() != null) {
                    str = this.mFrameContext.D().get("livesource");
                } else {
                    str = "";
                }
                this.mUserTaskController.G(str, new d());
            }
        }
    }

    private ysv createOrGetUserTaskController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ysv) ipChange.ipc$dispatch("d0e3b9bc", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || ux9Var.j() == null) {
            return null;
        }
        if (this.mFrameContext.j().s() != null && (this.mFrameContext.j().s() instanceof ysv)) {
            return (ysv) this.mFrameContext.j().s();
        }
        ysv ysvVar = new ysv("liveroom", up6.V(this.mFrameContext), (t54) this.mFrameContext, this.mScene);
        this.mFrameContext.j().K(ysvVar);
        return ysvVar;
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        loge("destroy");
        this.mHasDidAppear = false;
        FloatingUserTaskView floatingUserTaskView = this.mFloatingUserTaskView;
        if (floatingUserTaskView != null) {
            floatingUserTaskView.setVisibility(8);
        }
        ysv ysvVar = this.mUserTaskController;
        if (ysvVar != null) {
            ysvVar.c0(this.rvParent);
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.t() != null) {
            this.mFrameContext.t().a(this);
        }
    }

    private void initFloatingViewPos(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf269d72", new Object[]{this, view});
        } else if (view != null) {
            view.postDelayed(new e(view), 50L);
        }
    }

    public static /* synthetic */ Object ipc$super(FloatingUserTaskFrame floatingUserTaskFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/FloatingUserTaskFrame");
        }
    }

    private void loge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{this, str});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("UserTaskController", this + " " + str);
        }
    }

    private szd updateUserTask(boolean z) {
        UserTaskView2 userTaskView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (szd) ipChange.ipc$dispatch("c91509b1", new Object[]{this, new Boolean(z)});
        }
        UserTaskView2 userTaskView22 = null;
        if (z) {
            RecyclerView recyclerView = this.rvParent;
            if (recyclerView != null) {
                int i = R.id.taolive_user_task_view_recycle_flexalocal;
                if (recyclerView.getTag(i) instanceof UserTaskView2) {
                    loge("UserTaskView2 复用");
                    userTaskView2 = (UserTaskView2) this.rvParent.getTag(i);
                    this.rvParent.setTag(i, null);
                    userTaskView22 = userTaskView2;
                    this.mFloatingUserTaskView.setVisibility(0);
                    this.mFloatingUserTaskView.initView(userTaskView22.getView());
                    initFloatingViewPos(this.mFloatingUserTaskView);
                }
            }
            userTaskView2 = new UserTaskView2(this.mContext);
            userTaskView22 = userTaskView2;
            this.mFloatingUserTaskView.setVisibility(0);
            this.mFloatingUserTaskView.initView(userTaskView22.getView());
            initFloatingViewPos(this.mFloatingUserTaskView);
        }
        return userTaskView22;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_room_user_task_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
        } else {
            super.onCleanUp();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (this.mHasDidAppear) {
            appear(false);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        this.mHasDidAppear = true;
        this.mUserTaskController = createOrGetUserTaskController();
        if (this.mLiveDataModel != null) {
            appear(false);
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.t() != null) {
            this.mFrameContext.t().l(this, new c(this));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ysv ysvVar = this.mUserTaskController;
        if (ysvVar != null) {
            ysvVar.T();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ysv ysvVar = this.mUserTaskController;
        if (ysvVar != null) {
            ysvVar.U();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        loge("onViewCreated view = " + view);
        super.onViewCreated(view);
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.j() == null)) {
            this.rvParent = this.mFrameContext.j().p();
        }
        FloatingUserTaskView floatingUserTaskView = (FloatingUserTaskView) view;
        this.mFloatingUserTaskView = floatingUserTaskView;
        if (floatingUserTaskView != null) {
            floatingUserTaskView.setVisibility(8);
            this.mFloatingUserTaskView.setIUserTaskEntryClickListener(new a());
            this.mFloatingUserTaskView.setIUserTaskPosChanged(new b());
        }
    }

    public void setIUserTaskEventListener(r7e r7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9e047b", new Object[]{this, r7eVar});
            return;
        }
        FloatingUserTaskView floatingUserTaskView = this.mFloatingUserTaskView;
        if (floatingUserTaskView != null) {
            floatingUserTaskView.setIUserTaskEventListener(r7eVar);
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        JSONObject d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        if (i == 1018) {
            try {
                if ((obj instanceof TLiveMsg) && (d2 = fkx.d(new String(((TLiveMsg) obj).data))) != null && "alivemodx-shopping-train".equals(d2.getString("name"))) {
                    loge("onMessageReceived alivemodx-shopping-train");
                    JSONObject jSONObject = d2.getJSONArray("components").getJSONObject(0).getJSONObject("data").getJSONObject("bizData");
                    if (jSONObject != null) {
                        String string = jSONObject.getString("actionType");
                        int intValue = jSONObject.getIntValue("entryDisperseTime");
                        if (string != null && string.equals("getEntry")) {
                            if (intValue > 0) {
                                this.mFloatingUserTaskView.postDelayed(new f(), new Random().nextInt(5) * 1000);
                            } else {
                                loge("onMessageReceived alivemodx-shopping-train appear");
                                destroy();
                                appear(true);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
