package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.pre.LiveDetailPreRequestParams;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.hlc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fon extends mei implements hlc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;

    static {
        t2o.a(779093133);
        t2o.a(806356090);
    }

    public fon(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(fon fonVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/prerequest/RecommendPreRequest");
    }

    @Override // tb.mei
    public void a(Intent intent, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4442697f", new Object[]{this, intent, uri});
            return;
        }
        String queryParameter = uri.getQueryParameter("livesource");
        this.b = queryParameter;
        LiveDetailPreRequestParams b = xnm.b(uri);
        if (TextUtils.isEmpty(b.liveSource)) {
            b.liveSource = queryParameter;
        }
        if (!Boolean.parseBoolean(b.needRecommend)) {
            b.needRecommend = "true";
        }
        vnm.c().g(b, queryParameter);
        vnm c = vnm.c();
        c.j(vnm.PRE_CREATE_ROOM_REC + queryParameter, this, null);
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter(yj4.SHOULD_USE_PRE_CREATE_REC, String.valueOf(Boolean.TRUE));
        if (intent != null) {
            intent.setData(buildUpon.build());
        }
    }

    @Override // tb.hlc.a
    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
        }
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
        } else {
            wnm.b().d(this.f23990a, nei.a());
        }
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
            return;
        }
        wnm b = wnm.b();
        if (videoInfo == null || videoInfo.liveId == null) {
            vnm c = vnm.c();
            c.i(vnm.PRE_CREATE_ROOM_REC + this.b);
            TLog.loge("tblive", "RecommendPreRequest", "live id 为空");
            b.d(this.f23990a, nei.a());
            return;
        }
        b.d(this.f23990a, nei.b(mxg.b(videoInfo)));
    }
}
