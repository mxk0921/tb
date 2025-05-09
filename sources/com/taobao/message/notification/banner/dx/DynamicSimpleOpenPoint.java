package com.taobao.message.notification.banner.dx;

import com.taobao.android.dinamicx.DXRootView;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DynamicSimpleOpenPoint;", "", "", "renderStatus", "Ltb/xhv;", "onAfterRender", "(I)V", "onBeforeRender", "()V", "onBeforeCreateView", "Lcom/taobao/android/dinamicx/DXRootView;", "deRootView", "onAfterCreateView", "(Lcom/taobao/android/dinamicx/DXRootView;)V", "Companion", "notification_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface DynamicSimpleOpenPoint {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int RENDER_FAIL = 1;
    public static final int RENDER_SUCCESS = 0;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DynamicSimpleOpenPoint$Companion;", "", "()V", "RENDER_FAIL", "", "RENDER_SUCCESS", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int RENDER_FAIL = 1;
        public static final int RENDER_SUCCESS = 0;

        static {
            t2o.a(610271254);
        }

        private Companion() {
        }
    }

    void onAfterCreateView(DXRootView dXRootView);

    void onAfterRender(int i);

    void onBeforeCreateView();

    void onBeforeRender();
}
