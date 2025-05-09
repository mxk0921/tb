package com.taobao.themis.kernel.page;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import kotlin.Deprecated;
import tb.bbs;
import tb.ccs;
import tb.ckf;
import tb.mcs;
import tb.pcs;
import tb.t2o;
import tb.tll;
import tb.x4k;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITMSPage extends x4k {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class PageStatusEnum extends Enum<PageStatusEnum> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final PageStatusEnum INIT = new PageStatusEnum(ModuleConstants.VI_MODULE_NAME_INIT, 0);
        public static final PageStatusEnum ON_START = new PageStatusEnum(mcs.EVENT_ON_START, 1);
        public static final PageStatusEnum ON_RESUME = new PageStatusEnum("ON_RESUME", 2);
        public static final PageStatusEnum ON_VIEW_APPEAR = new PageStatusEnum(mcs.EVENT_PAGE_ON_VIEW_APPEAR, 3);
        public static final PageStatusEnum ON_VIEW_DISAPPEAR = new PageStatusEnum(mcs.EVENT_PAGE_ON_VIEW_DISAPPEAR, 4);
        public static final PageStatusEnum ON_PAUSE = new PageStatusEnum("ON_PAUSE", 5);
        public static final PageStatusEnum ON_STOP = new PageStatusEnum("ON_STOP", 6);
        public static final PageStatusEnum DESTROYED = new PageStatusEnum("DESTROYED", 7);
        private static final /* synthetic */ PageStatusEnum[] $VALUES = $values();

        private static final /* synthetic */ PageStatusEnum[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PageStatusEnum[]) ipChange.ipc$dispatch("29d3ea73", new Object[0]) : new PageStatusEnum[]{INIT, ON_START, ON_RESUME, ON_VIEW_APPEAR, ON_VIEW_DISAPPEAR, ON_PAUSE, ON_STOP, DESTROYED};
        }

        private PageStatusEnum(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(PageStatusEnum pageStatusEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/page/ITMSPage$PageStatusEnum");
        }

        public static PageStatusEnum valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("f1cd9a8", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(PageStatusEnum.class, str);
            }
            return (PageStatusEnum) valueOf;
        }

        public static PageStatusEnum[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("3b24c617", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (PageStatusEnum[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.kernel.page.ITMSPage$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C0773a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(839909866);
            }

            public static void a(a aVar, ITMSPage iTMSPage) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b6d9ffda", new Object[]{aVar, iTMSPage});
                    return;
                }
                ckf.g(aVar, "this");
                ckf.g(iTMSPage, "page");
            }

            public static void b(a aVar, ITMSPage iTMSPage) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("367323af", new Object[]{aVar, iTMSPage});
                    return;
                }
                ckf.g(aVar, "this");
                ckf.g(iTMSPage, "page");
            }

            public static void c(a aVar, ITMSPage iTMSPage) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("196d0d46", new Object[]{aVar, iTMSPage});
                    return;
                }
                ckf.g(aVar, "this");
                ckf.g(iTMSPage, "page");
            }

            public static void d(a aVar, ITMSPage iTMSPage) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ad148784", new Object[]{aVar, iTMSPage});
                    return;
                }
                ckf.g(aVar, "this");
                ckf.g(iTMSPage, "page");
            }

            public static void e(a aVar, ITMSPage iTMSPage) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("50a986dc", new Object[]{aVar, iTMSPage});
                    return;
                }
                ckf.g(aVar, "this");
                ckf.g(iTMSPage, "page");
            }

            public static void f(a aVar, ITMSPage iTMSPage) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4630162", new Object[]{aVar, iTMSPage});
                    return;
                }
                ckf.g(aVar, "this");
                ckf.g(iTMSPage, "page");
            }
        }

        void a(ITMSPage iTMSPage);

        void f(ITMSPage iTMSPage);

        void g(ITMSPage iTMSPage);

        void h(ITMSPage iTMSPage);

        void l(ITMSPage iTMSPage);

        void n(ITMSPage iTMSPage);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(ITMSPage iTMSPage);

        void f(ITMSPage iTMSPage);
    }

    void A(String str, String str2, JSON json);

    void B(tll tllVar);

    void C(a aVar);

    PageStatusEnum D();

    String c();

    void destroy();

    String f();

    <T> T getExtension(Class<T> cls);

    bbs getInstance();

    tll getPageContext();

    ccs getPageParams();

    View getView();

    boolean isDestroyed();

    Bitmap l();

    void n(String str, String str2);

    void onActivityResult(int i, int i2, Intent intent);

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void onViewAppear();

    void onViewDisappear();

    void r(byte[] bArr, String str);

    void reload(pcs pcsVar);

    void s();

    void t(z5d z5dVar);

    void u(a aVar);

    void v(b bVar);

    void w(String str, JSON json);

    void x(z5d z5dVar);

    @Deprecated(message = "use sendEventToRender")
    void y(String str, JSON json);

    TMSJSAPIHandler z();
}
