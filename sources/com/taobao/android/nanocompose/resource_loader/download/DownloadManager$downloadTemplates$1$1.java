package com.taobao.android.nanocompose.resource_loader.download;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.i04;
import tb.i5z;
import tb.izy;
import tb.l5z;
import tb.nrz;
import tb.nzy;
import tb.u1a;
import tb.v6z;
import tb.xhv;
import tb.y1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DownloadManager$downloadTemplates$1$1 extends Lambda implements g1a<izy, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $businessID;
    public final /* synthetic */ y1a<List<TemplateItem>, List<TemplateItem>, List<TemplateItem>, List<TemplateItem>, xhv> $completionCallback;
    public final /* synthetic */ u1a<Short, String, xhv> $errorCallback;
    public final /* synthetic */ nzy $taskInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DownloadManager$downloadTemplates$1$1(String str, nzy nzyVar, y1a<? super List<TemplateItem>, ? super List<TemplateItem>, ? super List<TemplateItem>, ? super List<TemplateItem>, xhv> y1aVar, u1a<? super Short, ? super String, xhv> u1aVar) {
        super(1);
        this.$businessID = str;
        this.$completionCallback = y1aVar;
        this.$errorCallback = u1aVar;
    }

    public static /* synthetic */ Object ipc$super(DownloadManager$downloadTemplates$1$1 downloadManager$downloadTemplates$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/resource_loader/download/DownloadManager$downloadTemplates$1$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(izy izyVar) {
        invoke2(izyVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(izy izyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a80677", new Object[]{this, izyVar});
            return;
        }
        ckf.g(izyVar, "response");
        try {
            List E0 = i04.E0(izyVar.a());
            ArrayList arrayList = (ArrayList) E0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i5z.a().remove(((TemplateItem) it.next()).b());
            }
            ArrayList arrayList2 = new ArrayList();
            for (l5z l5zVar : izyVar.b()) {
                TemplateItem a2 = l5zVar.a();
                l5zVar.b();
                if (!v6z.INSTANCE.a(a2.a())) {
                    arrayList.add(a2);
                    i5z.a().remove(a2.b());
                } else {
                    nrz.INSTANCE.a(this.$businessID, i5z.INSTANCE.b(a2));
                    arrayList2.add(a2);
                    i5z.a().remove(a2.b());
                }
            }
            new ArrayList();
            if (!((ArrayList) E0).isEmpty()) {
                throw null;
            }
            throw null;
        } catch (Exception e) {
            u1a<Short, String, xhv> u1aVar = this.$errorCallback;
            if (u1aVar != null) {
                String message = e.getMessage();
                if (message == null) {
                    message = "download template error";
                }
                u1aVar.invoke((short) -1, message);
            }
        }
    }
}
