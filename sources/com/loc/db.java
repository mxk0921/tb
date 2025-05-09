package com.loc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class db {
    private ef b;

    /* renamed from: a  reason: collision with root package name */
    private List<eg> f5652a = new ArrayList();
    private ArrayList<eg> c = new ArrayList<>();

    private List<eg> b(List<eg> list) {
        Collections.sort(list, new Comparator<eg>() { // from class: com.loc.db.1
            private static int a(eg egVar, eg egVar2) {
                return egVar2.c - egVar.c;
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(eg egVar, eg egVar2) {
                return a(egVar, egVar2);
            }
        });
        return list;
    }

    public final List<eg> a(ef efVar, List<eg> list, boolean z, long j, long j2) {
        if (!b(efVar, list, z, j, j2)) {
            return null;
        }
        b(this.c, list);
        this.f5652a.clear();
        this.f5652a.addAll(list);
        this.b = efVar;
        return this.c;
    }

    private static List<eg> a(List<eg> list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            eg egVar = list.get(i);
            hashMap.put(Integer.valueOf(egVar.c), egVar);
        }
        arrayList.addAll(hashMap.values());
        return arrayList;
    }

    private void b(List<eg> list, List<eg> list2) {
        list.clear();
        if (list2 != null) {
            List<eg> b = b(a(list2));
            int size = b.size();
            if (size > 40) {
                size = 40;
            }
            for (int i = 0; i < size; i++) {
                list.add(b.get(i));
            }
        }
    }

    private boolean a(ef efVar) {
        float f = efVar.g;
        float f2 = 10.0f;
        if (f > 10.0f) {
            f2 = 200.0f;
        } else if (f > 2.0f) {
            f2 = 50.0f;
        }
        return efVar.a(this.b) > ((double) f2);
    }

    private boolean b(ef efVar, List<eg> list, boolean z, long j, long j2) {
        if (!z || !a(efVar, j, j2) || list == null || list.size() <= 0) {
            return false;
        }
        if (this.b == null) {
            return true;
        }
        boolean a2 = a(efVar);
        return !a2 ? true ^ a(list, this.f5652a) : a2;
    }

    private static boolean a(ef efVar, long j, long j2) {
        return j > 0 && j2 - j < ((long) ((efVar.g > 10.0f ? 1 : (efVar.g == 10.0f ? 0 : -1)) >= 0 ? 2000 : 3500));
    }

    private static boolean a(List<eg> list, List<eg> list2) {
        if (!(list == null || list2 == null)) {
            int size = list.size();
            int size2 = list2.size();
            int i = size + size2;
            if (size <= size2) {
                list2 = list;
                list = list2;
            }
            HashMap hashMap = new HashMap(list.size());
            for (eg egVar : list) {
                hashMap.put(Long.valueOf(egVar.f5665a), 1);
            }
            int i2 = 0;
            for (eg egVar2 : list2) {
                if (((Integer) hashMap.get(Long.valueOf(egVar2.f5665a))) != null) {
                    i2++;
                }
            }
            if (i2 * 2.0d >= i * 0.5d) {
                return true;
            }
        }
        return false;
    }
}
