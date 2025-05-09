package com.taobao.kirinvideoengine.states.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.azf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class KirinVideoStateModel implements Serializable {
    public a<String> hasDownloadSet = new a<>(70);

    static {
        t2o.a(500170815);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f10886a;
        public final ArrayList<E> b = new ArrayList<>();

        static {
            t2o.a(500170816);
        }

        public a(int i) {
            this.f10886a = i;
        }

        public boolean b(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, e})).booleanValue();
            }
            return this.b.contains(e);
        }

        public List<E> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("85f5d54c", new Object[]{this});
            }
            return this.b;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return this.b.size();
        }

        public void a(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba2da84", new Object[]{this, e});
            } else if (this.b.remove(e)) {
                this.b.add(e);
            } else {
                if (this.b.size() >= this.f10886a) {
                    E remove = this.b.remove(0);
                    azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask,预下载达到缓存最大:" + this.f10886a + "。移除最老:" + remove);
                }
                this.b.add(e);
            }
        }
    }
}
