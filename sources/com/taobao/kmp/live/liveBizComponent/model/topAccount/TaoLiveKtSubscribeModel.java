package com.taobao.kmp.live.liveBizComponent.model.topAccount;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import com.uc.webview.export.media.CommandID;
import kotlin.Metadata;
import tb.a07;
import tb.c4o;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataSourceModel;", c4o.KEY_DATA_SOURCE, "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataSourceModel;", "getDataSource", "()Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataSourceModel;", CommandID.setDataSource, "(Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataSourceModel;)V", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataTrackModel;", "dataTrack", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataTrackModel;", "getDataTrack", "()Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataTrackModel;", "setDataTrack", "(Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeDataTrackModel;)V", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtSubscribeModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private TaoLiveKtSubscribeDataSourceModel dataSource;
    private TaoLiveKtSubscribeDataTrackModel dataTrack;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487326);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487325);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtSubscribeModel taoLiveKtSubscribeModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeModel");
    }

    public final TaoLiveKtSubscribeDataSourceModel getDataSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSubscribeDataSourceModel) ipChange.ipc$dispatch("c850cae9", new Object[]{this});
        }
        return this.dataSource;
    }

    public final TaoLiveKtSubscribeDataTrackModel getDataTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSubscribeDataTrackModel) ipChange.ipc$dispatch("54ac7871", new Object[]{this});
        }
        return this.dataTrack;
    }

    public final void setDataSource(TaoLiveKtSubscribeDataSourceModel taoLiveKtSubscribeDataSourceModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4641c6e9", new Object[]{this, taoLiveKtSubscribeDataSourceModel});
        } else {
            this.dataSource = taoLiveKtSubscribeDataSourceModel;
        }
    }

    public final void setDataTrack(TaoLiveKtSubscribeDataTrackModel taoLiveKtSubscribeDataTrackModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd59ff3", new Object[]{this, taoLiveKtSubscribeDataTrackModel});
        } else {
            this.dataTrack = taoLiveKtSubscribeDataTrackModel;
        }
    }
}
