package tb;

import com.taobao.taopai2.material.base.MaterialRequestPolicy;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface erc extends yqc {
    String getAPI();

    MethodEnum getMethod();

    MaterialRequestPolicy getRequestPolicy();

    boolean needLogin();
}
