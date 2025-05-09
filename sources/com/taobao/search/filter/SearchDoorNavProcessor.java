package com.taobao.search.filter;

import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.search.filter.SearchDoorNavProcessor;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.ai.AISearchConfigManager;
import org.android.agoo.common.AgooConstants;
import tb.ckf;
import tb.le1;
import tb.p02;
import tb.t2o;
import tb.y4p;
import tb.y90;
import tb.yak;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchDoorNavProcessor extends p02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792263);
    }

    public static /* synthetic */ Object ipc$super(SearchDoorNavProcessor searchDoorNavProcessor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/filter/SearchDoorNavProcessor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHitOldActivity$lambda$0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c81546", new Object[]{str});
            return;
        }
        y90.INSTANCE.m(str);
        yak.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHitOldActivity$lambda$1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa29fd", new Object[0]);
            return;
        }
        y90.INSTANCE.l();
        yak.a();
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "SearchDoorNavProcessor";
    }

    @Override // tb.p02
    public void onHitOldActivity(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ab31f0", new Object[]{this, intent, zmjVar});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.g(zmjVar, "navContext");
        if (!ckf.b(intent.getAction(), AgooConstants.MESSAGE_POPUP)) {
            try {
                AISearchConfigManager.INSTANCE.d();
            } catch (Exception unused) {
            }
            boolean r = y4p.r();
            final String w3 = SearchDoorActivity.w3(intent);
            if (r) {
                Handler b = le1.b();
                le1.e();
                if (!TextUtils.isEmpty(w3)) {
                    b.post(new Runnable() { // from class: tb.umz
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchDoorNavProcessor.onHitOldActivity$lambda$0(w3);
                        }
                    });
                } else {
                    b.post(new Runnable() { // from class: tb.vmz
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchDoorNavProcessor.onHitOldActivity$lambda$1();
                        }
                    });
                }
            }
        }
    }
}
