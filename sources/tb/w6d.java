package tb;

import com.taobao.live.home.business.BaseListRequest;
import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface w6d {
    void Q1(BaseListRequest baseListRequest);

    void i1(BaseListRequest baseListRequest);

    boolean onJudgeEnd();

    void onPageEnd();

    void onPageError(String str);

    void onPageReceived(BaseOutDo baseOutDo);

    void onPageReload(BaseOutDo baseOutDo);
}
