package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.pre.LiveDetailPreRequestParams;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.MediaData;
import tb.hlc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class oln implements hhd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements hlc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25462a;

        public a(oln olnVar, String str) {
            this.f25462a = str;
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
                return;
            }
            vnm c = vnm.c();
            c.i(vnm.PRE_CREATE_ROOM_REC + this.f25462a);
        }

        @Override // tb.hlc.a
        public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
            } else if (videoInfo == null || videoInfo.liveId == null) {
                vnm c = vnm.c();
                c.i(vnm.PRE_CREATE_ROOM_REC + this.f25462a);
                TLog.loge("tblive", "RecPreCreateImpl", "live id 为空");
            } else {
                mln mlnVar = new mln();
                mlnVar.f24123a = videoInfo.liveId;
                MediaData b = mxg.b(videoInfo);
                gsm.a().f(this.f25462a, mlnVar);
                lgi lgiVar = new lgi();
                lgiVar.f23322a = b;
                gsm.a().e(videoInfo.liveId, lgiVar);
            }
        }
    }

    static {
        t2o.a(779093099);
        t2o.a(779093119);
    }

    public void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a1067b", new Object[]{this, context, str, str2});
        } else if (x9l.c()) {
            Uri parse = Uri.parse(str);
            if (gsm.a().g(str2)) {
                LiveDetailPreRequestParams b = xnm.b(parse);
                if (TextUtils.isEmpty(b.liveSource)) {
                    b.liveSource = str2;
                }
                if (!Boolean.parseBoolean(b.needRecommend)) {
                    b.needRecommend = "true";
                }
                vnm.c().g(b, str2);
                vnm c = vnm.c();
                c.j(vnm.PRE_CREATE_ROOM_REC + str2, new a(this, str2), null);
            }
        }
    }
}
