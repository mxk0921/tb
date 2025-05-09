package com.taobao.themis.container.splash;

import kotlin.Metadata;
import tb.a3c;
import tb.bbs;
import tb.n8s;
import tb.qmc;
import tb.y0e;
import tb.y2c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/container/splash/ISplashViewFactory;", "Ltb/n8s;", "Ltb/bbs;", "instance", "Ltb/y0e;", "createTitleBar", "(Ltb/bbs;)Ltb/y0e;", "Ltb/qmc;", "createLoadingPage", "(Ltb/bbs;)Ltb/qmc;", "Ltb/y2c;", "createErrorPage", "(Ltb/bbs;)Ltb/y2c;", "Ltb/a3c;", "createErrorWidget", "(Ltb/bbs;)Ltb/a3c;", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ISplashViewFactory extends n8s {
    y2c createErrorPage(bbs bbsVar);

    a3c createErrorWidget(bbs bbsVar);

    qmc createLoadingPage(bbs bbsVar);

    y0e createTitleBar(bbs bbsVar);
}
