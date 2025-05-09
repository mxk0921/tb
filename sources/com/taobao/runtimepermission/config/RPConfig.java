package com.taobao.runtimepermission.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.p78;
import tb.vyl;
import tb.xyl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RPConfig {
    private static final String[] DEFAULT_BIZ_PERMISSION_WHITE_LIST = {p78.ACCESS_FINE_LOCATION, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.WRITE_CALENDAR", "android.permission.READ_MEDIA_AUDIO", xyl.READ_MEDIA_IMAGES, xyl.READ_MEDIA_VIDEO, xyl.READ_MEDIA_VISUAL_USER_SELECTED};
    public boolean enable = true;
    public List<String> sameScreenPopBizBlackList = null;
    public long sameScreenPopDelayTime = 400;
    public long sameScreenMarkDelayTime = 300;
    public long permissionReqSilenceInterval = vyl.MAX_COMMIT_TIME_INTERVAL;
    public List<String> callbackBizBlackList = new ArrayList();
    public List<String> bizPermissionWhiteList = Arrays.asList(DEFAULT_BIZ_PERMISSION_WHITE_LIST);
    public List<String> rollbackBizList = new ArrayList();
    public boolean enableUniformAuth = false;
}
