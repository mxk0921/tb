package com.taobao.infoflow.protocol.model.datamodel.action;

import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IUiRefreshActionModel {
    public static final String DATA_CHANGE_TYPE_BASE = "base";
    public static final String DATA_CHANGE_TYPE_DELTA = "delta";
    public static final String DATA_SOURCE_TYPE_DOWNLOAD = "download";
    public static final String DATA_SOURCE_TYPE_LOCAL = "local";
    public static final String DATA_SOURCE_TYPE_REMOTE = "remote";
    public static final String OPERATION_TYPE_SCROLL_TO_TOP = "scrollToTop";
    public static final String OPERATION_TYPE_UI_REFRESH = "uiRefresh";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface DataChange {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface Operation {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface SourceType {
    }

    String getContainerId();

    IContainerDataModel getContainerModel();

    String getDataChangeType();

    String getDataSourceType();

    String getErrorCode();

    String getRequestType();

    String getUiOperationType();

    boolean isSecondReturn();
}
