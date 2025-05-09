package com.taobao.kmp.live.liveBizComponent.model.topAccount;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtFansClubModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "status", TLogTracker.LEVEL_INFO, "getStatus", "()I", "setStatus", "(I)V", "", "clubLevelIcon", "Ljava/lang/String;", "getClubLevelIcon", "()Ljava/lang/String;", "setClubLevelIcon", "(Ljava/lang/String;)V", "clubLevelWithFavorIcon", "getClubLevelWithFavorIcon", "setClubLevelWithFavorIcon", "clubLevelSquareIcon", "getClubLevelSquareIcon", "setClubLevelSquareIcon", "clubLevelWithFavorSquareIcon", "getClubLevelWithFavorSquareIcon", "setClubLevelWithFavorSquareIcon", "getFavorWithClubIcon", "favorWithClubIcon", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtFansClubModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private int status;
    private String clubLevelIcon = "https://gw.alicdn.com/imgextra/i4/O1CN01RtDG5v1V4OKVEHdzH_!!6000000002599-2-tps-126-78.png";
    private String clubLevelWithFavorIcon = "https://gw.alicdn.com/imgextra/i1/O1CN01hfkHBl22rkKdUid9C_!!6000000007174-2-tps-114-78.png";
    private String clubLevelSquareIcon = "https://gw.alicdn.com/imgextra/i2/O1CN01BIJy2n1d0kAt4nYZ8_!!6000000003674-2-tps-200-112.png";
    private String clubLevelWithFavorSquareIcon = "https://gw.alicdn.com/imgextra/i3/O1CN01XbfMsx1S34PeYUhqq_!!6000000002190-2-tps-152-112.png";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487318);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487317);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtFansClubModel taoLiveKtFansClubModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtFansClubModel");
    }

    public final String getClubLevelIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("709aed48", new Object[]{this});
        }
        return this.clubLevelIcon;
    }

    public final String getClubLevelSquareIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("245b00ab", new Object[]{this});
        }
        return this.clubLevelSquareIcon;
    }

    public final String getClubLevelWithFavorIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ddd1c0", new Object[]{this});
        }
        return this.clubLevelWithFavorIcon;
    }

    public final String getClubLevelWithFavorSquareIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7ceab23", new Object[]{this});
        }
        return this.clubLevelWithFavorSquareIcon;
    }

    public final String getFavorWithClubIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d8c53c", new Object[]{this});
        }
        if (this.status == 0) {
            return "https://gw.alicdn.com/imgextra/i3/O1CN01tKqVXd1By0B4xjVZk_!!6000000000013-2-tps-152-112.png";
        }
        return "https://gw.alicdn.com/imgextra/i2/O1CN01030R7l1Y5Fzyhdjsl_!!6000000003007-2-tps-152-112.png";
    }

    public final int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.status;
    }

    public final void setClubLevelIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7629d96", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.clubLevelIcon = str;
    }

    public final void setClubLevelSquareIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eda8f93", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.clubLevelSquareIcon = str;
    }

    public final void setClubLevelWithFavorIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd56bbb6", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.clubLevelWithFavorIcon = str;
    }

    public final void setClubLevelWithFavorSquareIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658795b3", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.clubLevelWithFavorSquareIcon = str;
    }

    public final void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }
}
