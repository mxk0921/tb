package com.taobao.android.dinamicx.expression.event;

import android.text.TextUtils;
import java.util.HashMap;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRecyclerLayoutLoadMoreEvent extends DXEvent {
    public static final long DXRECYCLERLAYOUT_ONENDREACHED = -2277119638481222228L;
    private String userId;

    static {
        t2o.a(444596811);
    }

    public DXRecyclerLayoutLoadMoreEvent(String str) {
        super(-2277119638481222228L);
        this.userId = str;
        if (this.args == null) {
            this.args = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            this.args.put("userId", mw5.O(""));
        } else {
            this.args.put("userId", mw5.O(str));
        }
    }
}
