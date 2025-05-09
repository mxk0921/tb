package com.taobao.android.nanocompose.resource_loader.download;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.homepage.pop.utils.PopConst;
import tb.ckf;
import tb.orz;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DownloadTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f9021a;
    public final long b;
    public int c = -1;

    static {
        t2o.a(598737199);
    }

    public DownloadTask(String str, long j, boolean z) {
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        this.f9021a = str;
        this.b = j;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.c != 2) {
            this.c = 2;
        }
    }

    public final void b(TemplateItem templateItem, String str, u1a<? super Boolean, ? super String, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb2feb4", new Object[]{this, templateItem, str, u1aVar});
            return;
        }
        ckf.g(templateItem, "templateItem");
        ckf.g(str, "cachedFilePath");
        ckf.g(u1aVar, "onDownloadCompleted");
        orz.INSTANCE.a(templateItem.d(), new DownloadTask$downloadTemplate$1(templateItem, str, u1aVar), new DownloadTask$downloadTemplate$2(u1aVar));
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("883dfac8", new Object[]{this});
        }
        return this.f9021a;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a0c8b7f", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35afa6c3", new Object[]{this});
        } else if (this.c != 1) {
            this.c = 1;
        }
    }
}
