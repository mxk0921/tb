package com.taobao.android.preload.core.task;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.btm;
import tb.csm;
import tb.cw6;
import tb.dtm;
import tb.kcd;
import tb.ktm;
import tb.kzd;
import tb.ltm;
import tb.wsm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Deque<PreloadTaskEntity.a> f9178a = new ArrayDeque();
    public final dtm b = new dtm();

    public synchronized void a(PreloadTaskEntity.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6148b1cd", new Object[]{this, aVar});
            return;
        }
        if (((ArrayDeque) this.f9178a).contains(aVar)) {
            ((ArrayDeque) this.f9178a).remove(aVar);
        }
        ((ArrayDeque) this.f9178a).push(aVar);
    }

    public synchronized void c(String str, kcd kcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fdc493", new Object[]{this, str, kcdVar});
        } else {
            this.b.a(str, kcdVar);
        }
    }

    public synchronized void e(String str, kcd kcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b045a97", new Object[]{this, str, kcdVar});
        } else {
            this.b.e(str, kcdVar);
        }
    }

    public synchronized PreloadTaskEntity b(int i, int i2, kzd kzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadTaskEntity) ipChange.ipc$dispatch("ad82921a", new Object[]{this, new Integer(i), new Integer(i2), kzdVar});
        } else if (((ArrayDeque) this.f9178a).isEmpty()) {
            return null;
        } else {
            PreloadTaskEntity preloadTaskEntity = new PreloadTaskEntity();
            ArrayList<PreloadTaskEntity.a> arrayList = new ArrayList<>();
            int i3 = 0;
            while (!((ArrayDeque) this.f9178a).isEmpty() && i3 < i) {
                PreloadTaskEntity.a aVar = (PreloadTaskEntity.a) ((ArrayDeque) this.f9178a).pop();
                arrayList.add(aVar);
                if (TextUtils.isEmpty(preloadTaskEntity.bizName)) {
                    preloadTaskEntity.bizName = aVar.f9177a;
                }
                if (TextUtils.isEmpty(preloadTaskEntity.sourceFrom)) {
                    preloadTaskEntity.sourceFrom = aVar.b;
                }
                if (TextUtils.isEmpty(preloadTaskEntity.pageToken)) {
                    preloadTaskEntity.pageToken = aVar.g;
                }
                i3++;
            }
            if (cw6.b()) {
                Iterator<PreloadTaskEntity.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    String a2 = csm.a("PreloadTaskEntityItemManager");
                    wsm.c(a2, "补偿前build task item:" + it.next().e);
                }
            }
            if (i3 > 0 && i3 < i) {
                wsm.c(csm.a("PreloadTaskEntityItemManager"), "build task 需要补偿");
                arrayList.addAll(d(Math.min(i2, i - i3), arrayList.get(0), preloadTaskEntity, kzdVar));
            }
            preloadTaskEntity.items = arrayList;
            if (cw6.b()) {
                Iterator<PreloadTaskEntity.a> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String a3 = csm.a("PreloadTaskEntityItemManager");
                    wsm.c(a3, "补偿后build task item:" + it2.next().e);
                }
            }
            String a4 = csm.a("PreloadTaskEntityItemManager");
            wsm.c(a4, "build task item size:" + arrayList.size());
            return preloadTaskEntity;
        }
    }

    public final ArrayList<PreloadTaskEntity.a> d(int i, PreloadTaskEntity.a aVar, PreloadTaskEntity preloadTaskEntity, kzd kzdVar) {
        ktm a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1664090", new Object[]{this, new Integer(i), aVar, preloadTaskEntity, kzdVar});
        }
        ArrayList<PreloadTaskEntity.a> arrayList = new ArrayList<>();
        CopyOnWriteArrayList<PreloadTaskEntity.a> d = this.b.d(this.b.c(preloadTaskEntity));
        if (cw6.b()) {
            Iterator<PreloadTaskEntity.a> it = d.iterator();
            while (it.hasNext()) {
                wsm.c(csm.a("PreloadTaskEntityItemManager"), "补偿前build task item:" + it.next().e);
            }
        }
        int indexOf = d.indexOf(aVar);
        wsm.c(csm.a("PreloadTaskEntityItemManager"), "build task 需要补偿 的源数据索引：" + indexOf);
        if (indexOf == -1) {
            return arrayList;
        }
        wsm.c(csm.a("PreloadTaskEntityItemManager"), "build task 需要补偿:" + i);
        while (i > 0 && indexOf < d.size() - 1) {
            indexOf++;
            PreloadTaskEntity.a aVar2 = d.get(indexOf);
            if (aVar2 != null && (a2 = ltm.a(aVar2.f9177a)) != null && !a2.h(aVar2.e) && !kzdVar.c(aVar2)) {
                if (aVar2.h != null) {
                    a2.d(new btm.b().n("deliver").l("low").m(aVar2.e).o(aVar2.h).p(preloadTaskEntity.sourceFrom).k());
                    if (cw6.b()) {
                        wsm.c(csm.a("PreloadTaskEntityItemManager"), aVar2.e + "补偿逻辑存在cachedata，过滤掉不再发起请求");
                    }
                } else if (!aVar2.i) {
                    arrayList.add(aVar2);
                    i--;
                } else if (cw6.b()) {
                    wsm.c(csm.a("PreloadTaskEntityItemManager"), aVar2.e + "补偿逻辑disablePreRequest 为true，过滤掉不再发起请求");
                }
            }
        }
        return arrayList;
    }
}
