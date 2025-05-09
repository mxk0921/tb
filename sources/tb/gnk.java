package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gnk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile gnk f20110a;

    static {
        t2o.a(295699543);
    }

    public static gnk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gnk) ipChange.ipc$dispatch("4cd74f49", new Object[0]);
        }
        if (f20110a == null) {
            synchronized (OfficialLiveEntryFrame.class) {
                try {
                    if (f20110a == null) {
                        f20110a = new gnk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20110a;
    }

    public boolean b(ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbd28162", new Object[]{this, ux9Var, tBLiveDataModel})).booleanValue();
        }
        if (h(ux9Var)) {
            return false;
        }
        return f(tBLiveDataModel);
    }

    public boolean c(ux9 ux9Var, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3ff848c", new Object[]{this, ux9Var, videoInfo})).booleanValue();
        }
        if (h(ux9Var)) {
            return false;
        }
        return g(videoInfo);
    }

    public boolean d(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2e1e945", new Object[]{this, tBLiveDataModel})).booleanValue();
        }
        if (tBLiveDataModel == null) {
            return false;
        }
        return e(tBLiveDataModel.mVideoInfo);
    }

    public boolean e(VideoInfo videoInfo) {
        VideoInfo.OfficialLiveInfo officialLiveInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5edd1909", new Object[]{this, videoInfo})).booleanValue();
        }
        if (videoInfo != null && (officialLiveInfo = videoInfo.officialLiveInfo) != null && !TextUtils.isEmpty(officialLiveInfo.officialLive) && "1".equals(videoInfo.roomStatus)) {
            return true;
        }
        return false;
    }

    public boolean h(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82a99ece", new Object[]{this, ux9Var})).booleanValue();
        }
        if (ux9Var == null || ux9Var.A() == null) {
            return false;
        }
        if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString().equals(ux9Var.A().bizCode) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(ux9Var.A().bizCode)) {
            return true;
        }
        return false;
    }

    public boolean f(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7773325e", new Object[]{this, tBLiveDataModel})).booleanValue();
        }
        return d(tBLiveDataModel) && "official".equals(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLive);
    }

    public boolean g(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c74f310", new Object[]{this, videoInfo})).booleanValue();
        }
        return e(videoInfo) && "official".equals(videoInfo.officialLiveInfo.officialLive);
    }
}
