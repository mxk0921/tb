package tb;

import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface n8e extends k0e {
    void B();

    void C(float f, long j);

    void E(BaseFrame baseFrame, VideoInfo videoInfo, boolean z);

    void F(VideoInfo videoInfo, String str, String str2, String str3);

    IPlayPublicService G();

    void H();

    void J(String str);

    String a();

    void a(VideoInfo videoInfo, fxa fxaVar);

    void b();

    void c();

    void d();

    void e(t4w t4wVar);

    void h(bxl bxlVar, String str);

    void i(VideoInfo videoInfo, TBLiveBizDataModel tBLiveBizDataModel);

    void k(BaseFrame baseFrame, VideoInfo videoInfo, String str);

    boolean l();

    void o(String str, long j);

    boolean onDestroy();

    void onDidDisappear();

    void onPause();

    void onResume();

    void onStart();

    void onStop(boolean z);

    void onWillDisappear();

    void p(RecModel recModel);

    void q();

    void r();

    void reset();

    void s(VideoInfo videoInfo, String str, String str2);

    void t(BaseFrame baseFrame, VideoInfo videoInfo, boolean z);

    void u();

    void x(long j);
}
