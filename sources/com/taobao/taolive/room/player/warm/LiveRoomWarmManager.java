package com.taobao.taolive.room.player.warm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import tb.cdr;
import tb.dba;
import tb.fkx;
import tb.m5h;
import tb.mxf;
import tb.mxg;
import tb.nqo;
import tb.pvs;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.up6;
import tb.v2s;
import tb.vwl;
import tb.ywg;
import tb.zkc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveRoomWarmManager extends BaseFrame implements s3c, IMediaPlayer.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LiveRoomWarmManager";
    private boolean flagMaskWarmup;
    private boolean isInit;
    private Context mContext;
    private final Runnable mDelayStayTask;
    private cdr mFrameContext;
    private dba mGlobalContextForRoom;
    private Handler mMainHandler;
    private RecyclerView mParent;
    private zkc mPlayerInstance;
    private ViewGroup mRootView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LiveRoomWarmManager.access$000(LiveRoomWarmManager.this, "mDelayStayTask run");
            if (LiveRoomWarmManager.access$100(LiveRoomWarmManager.this) != null) {
                LiveRoomWarmManager.access$100(LiveRoomWarmManager.this).j0.d = System.currentTimeMillis();
            }
            LiveRoomWarmManager.access$200(LiveRoomWarmManager.this);
        }
    }

    static {
        t2o.a(779093216);
        t2o.a(806355016);
        t2o.a(806356441);
    }

    public LiveRoomWarmManager(cdr cdrVar, Context context) {
        super(context, cdrVar);
        this.mDelayStayTask = new a();
        this.flagMaskWarmup = false;
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mFrameContext = cdrVar;
        if (cdrVar != null && (cdrVar.j() instanceof dba)) {
            dba dbaVar = (dba) this.mFrameContext.j();
            this.mGlobalContextForRoom = dbaVar;
            this.mParent = dbaVar.p();
        }
        this.mContext = context;
    }

    public static /* synthetic */ void access$000(LiveRoomWarmManager liveRoomWarmManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20dd0b6f", new Object[]{liveRoomWarmManager, str});
        } else {
            liveRoomWarmManager.log(str);
        }
    }

    public static /* synthetic */ dba access$100(LiveRoomWarmManager liveRoomWarmManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dba) ipChange.ipc$dispatch("cec33db0", new Object[]{liveRoomWarmManager});
        }
        return liveRoomWarmManager.mGlobalContextForRoom;
    }

    public static /* synthetic */ void access$200(LiveRoomWarmManager liveRoomWarmManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2c78a3", new Object[]{liveRoomWarmManager});
        } else {
            liveRoomWarmManager.onReceiveWarmEvent();
        }
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!isLegal() || !isSwitchOpen()) {
            log("is not Legal or is not open");
        } else {
            dba dbaVar = this.mGlobalContextForRoom;
            if (dbaVar != null) {
                dbaVar.j0.f = System.currentTimeMillis();
            }
            sjr.g().b(this);
            this.mMainHandler.removeCallbacks(this.mDelayStayTask);
            zkc zkcVar = this.mPlayerInstance;
            if (zkcVar != null) {
                zkcVar.d();
                this.mPlayerInstance = null;
            }
            m5h.c().a(this);
            this.isInit = false;
        }
    }

    private MediaData getMediaDataByRecModel(RecModel recModel) {
        ArrayList<QualitySelectItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("7bd50f13", new Object[]{this, recModel});
        }
        if (recModel == null || (arrayList = recModel.liveUrlList) == null || arrayList.isEmpty()) {
            return null;
        }
        return mxg.a(mxf.e(fkx.i(recModel)));
    }

    public static /* synthetic */ Object ipc$super(LiveRoomWarmManager liveRoomWarmManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/warm/LiveRoomWarmManager");
        }
    }

    private boolean isLegal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        if (this.mFrameContext == null || this.mGlobalContextForRoom == null || this.mContext == null) {
            return false;
        }
        return true;
    }

    private boolean isSwitchOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("359aa4f3", new Object[]{this})).booleanValue();
        }
        if (!pvs.C0() || vwl.e().d()) {
            return false;
        }
        return true;
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            v2s.o().A().a(TAG, str);
        }
    }

    private void onReceiveWarmEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bade0f78", new Object[]{this});
            return;
        }
        this.mMainHandler.removeCallbacks(this.mDelayStayTask);
        if (this.mPlayerInstance != null) {
            log("onEvent releaseAndDestroy");
            this.mPlayerInstance.d();
            this.mPlayerInstance = null;
        }
        warmUp();
    }

    private void pauseWarmupTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee35322", new Object[]{this});
            return;
        }
        log("开始上下滑，取消预热任务");
        this.mMainHandler.removeCallbacks(this.mDelayStayTask);
        sjr.g().b(this);
    }

    private void reportWarmUp(MediaData mediaData) {
        cdr cdrVar;
        zkc zkcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ef0cf5", new Object[]{this, mediaData});
        } else if (mediaData != null && (cdrVar = this.mFrameContext) != null && cdrVar.I0() != null && (zkcVar = this.mPlayerInstance) != null) {
            String str = mediaData.liveId;
            String a2 = zkcVar.a();
            log("reportWarmUp, liveId = " + str + ", playerToken = " + a2);
            this.mFrameContext.I0().L(a2, str);
        }
    }

    private void resumeWarmupTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57794919", new Object[]{this});
            return;
        }
        log("二次定坑，恢复预热任务");
        this.mMainHandler.postDelayed(this.mDelayStayTask, 1000L);
        sjr.g().a(this);
    }

    private void warmUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1baa9487", new Object[]{this});
        } else if (!isLegal() || !isSwitchOpen()) {
            log("is not Legal or is not open");
        } else {
            log("warmUp");
            RecModel j = this.mGlobalContextForRoom.s0() != null ? this.mGlobalContextForRoom.s0().j() : null;
            if (j != null) {
                MediaData mediaDataByRecModel = getMediaDataByRecModel(j);
                if (mediaDataByRecModel != null) {
                    dba dbaVar = this.mGlobalContextForRoom;
                    if (dbaVar != null) {
                        dbaVar.j0.f19971a = j.liveId;
                    }
                    warmUpWithMediaData(mediaDataByRecModel);
                    return;
                }
                log("warmUp nextData = null");
            }
        }
    }

    private void warmUpWithMediaData(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cfe5d61", new Object[]{this, mediaData});
        } else if (mediaData != null) {
            PreloadParams G = new PreloadParams.a(this.mContext).Q(mediaData).J(this.mFrameContext).K(this.mGlobalContextForRoom).Y(this.mRootView).G();
            log("warmUpWithMediaData");
            ywg ywgVar = new ywg(G);
            this.mPlayerInstance = ywgVar;
            ywgVar.w(mediaData, this);
            reportWarmUp(mediaData);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.disable_update_scroll_bgimg"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar == null) {
            return null;
        }
        return cdrVar.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        log("onDestroy");
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        log("onDidDisAppear");
        destroy();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!isLegal() || !isSwitchOpen()) {
            log("is not Legal or is not open");
        } else if ("com.taobao.taolive.room.disable_update_scroll_bgimg".equals(str)) {
            log("onEvent nextDataChanged");
            dba dbaVar = this.mGlobalContextForRoom;
            if (dbaVar != null) {
                dbaVar.j0.e = System.currentTimeMillis();
            }
            onReceiveWarmEvent();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        RecyclerView recyclerView = this.mParent;
        if (recyclerView != null && recyclerView.getLayoutManager() != null && pvs.o1()) {
            int childCount = this.mParent.getLayoutManager().getChildCount();
            if (this.mViewStatus != 2) {
                return;
            }
            if (i == 0 && childCount == 1) {
                this.flagMaskWarmup = false;
                resumeWarmupTask();
            } else if (!this.flagMaskWarmup) {
                this.flagMaskWarmup = true;
                pauseWarmupTask();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        this.flagMaskWarmup = false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.mFrameContext == null) {
            return String.valueOf(hashCode());
        }
        return hashCode() + " " + this.mFrameContext.p();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        log("onDidAppear");
        if (!isLegal() || !isSwitchOpen()) {
            log("is not Legal or is not open");
            return;
        }
        dba dbaVar = this.mGlobalContextForRoom;
        if (dbaVar != null) {
            dbaVar.j0.b = up6.W(this.mFrameContext);
            this.mGlobalContextForRoom.j0.c = System.currentTimeMillis();
        }
        if (!nqo.c() || m5h.c().b() == null) {
            this.isInit = true;
            this.mMainHandler.postDelayed(this.mDelayStayTask, pvs.o2());
            sjr.g().a(this);
            m5h.c().e(this);
            return;
        }
        log("has other running LiveRoomWarmManager");
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (!isLegal() || !isSwitchOpen()) {
            log("is not Legal or is not open");
            return false;
        }
        if (this.isInit && j == 12000) {
            dba dbaVar = this.mGlobalContextForRoom;
            if (dbaVar != null) {
                dbaVar.j0.h = System.currentTimeMillis();
            }
            log("预热warm succ");
        }
        return false;
    }

    public LiveRoomWarmManager(cdr cdrVar, Context context, ViewGroup viewGroup) {
        this(cdrVar, context);
        this.mRootView = viewGroup;
    }
}
