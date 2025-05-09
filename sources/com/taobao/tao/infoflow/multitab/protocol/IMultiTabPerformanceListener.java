package com.taobao.tao.infoflow.multitab.protocol;

import com.taobao.falco.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IMultiTabPerformanceListener {
    public static final String ON_CONTAINER_INIT_END = "containerInitE";
    public static final String ON_CONTAINER_INIT_START = "containerInitS";
    public static final String ON_ENGINE_INIT_END = "engineInitE";
    public static final String ON_ENGINE_INIT_START = "engineInitS";
    public static final String ON_FCP_END = "fcpRenderE";
    public static final String ON_FSP_END = "fspRenderE";
    public static final String ON_RENDER_START = "renderS";
    public static final String ON_REQUEST_END = "mainDocRequestE";
    public static final String ON_REQUEST_START = "mainDocRequestS";
    public static final String ON_ROUTE_END = "routeE";
    public static final String ON_ROUTE_START = "routeS";
    public static final String ON_TAB_CREATE = "onTabCreate";
    public static final String TAB_SCROLL_SELECT = "tabScrollSelect";
    public static final String TAB_SELECT = "tabSelected";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface OnStage {
    }

    String a();

    void b(String str, long j, String str2);

    void c(String str, int i);

    m d(String str);

    void e(boolean z);

    void f(String str, long j, String str2);

    void g(String str);

    void h(String str, long j);

    void i(String str, int i);
}
