package com.taobao.homepage.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.bqa;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UiDisplayDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UI_ERROR_TYPE_ALPHA_INVALID = 4;
    public static final int UI_ERROR_TYPE_CHILDREN_INVALID = 5;
    public static final int UI_ERROR_TYPE_FRAME_INVALID = 3;
    public static final int UI_ERROR_TYPE_INVISIBLE = 1;
    public static final int UI_ERROR_TYPE_NONE = 0;
    public static final int UI_ERROR_TYPE_SIZE_INVALID = 2;

    /* renamed from: a  reason: collision with root package name */
    public final a f10606a = new a();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface UiErrorType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        static {
            t2o.a(729809164);
        }
    }

    static {
        t2o.a(729809163);
    }

    public int a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40f3d2db", new Object[]{this, view})).intValue();
        }
        if (!view.isShown()) {
            bqa.d("UiDisplayDetector", "view is not shown");
            return 1;
        }
        int width = view.getWidth();
        this.f10606a.getClass();
        if (width > 0) {
            int height = view.getHeight();
            this.f10606a.getClass();
            if (height > 0) {
                Rect rect = new Rect();
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
                boolean localVisibleRect = view.getLocalVisibleRect(new Rect());
                if (!globalVisibleRect || !localVisibleRect) {
                    bqa.d("UiDisplayDetector", "view frame invalid");
                    return 3;
                }
                int width2 = view.getWidth() - rect.width();
                this.f10606a.getClass();
                if (width2 <= 100) {
                    int height2 = view.getHeight() - rect.height();
                    this.f10606a.getClass();
                    if (height2 <= 100) {
                        float alpha = view.getAlpha();
                        this.f10606a.getClass();
                        if (alpha < 1.0f) {
                            bqa.d("UiDisplayDetector", "view alpha invalid");
                            return 4;
                        }
                        if (view instanceof DXRootView) {
                            int childCount = ((ViewGroup) view).getChildCount();
                            this.f10606a.getClass();
                            if (childCount < 1) {
                                bqa.d("UiDisplayDetector", "view children invalid");
                                return 5;
                            }
                        }
                        return 0;
                    }
                }
                bqa.d("UiDisplayDetector", "view not show fully");
                return 3;
            }
        }
        bqa.d("UiDisplayDetector", "view size invalid");
        return 2;
    }
}
