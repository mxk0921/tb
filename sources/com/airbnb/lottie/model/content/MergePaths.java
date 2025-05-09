package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import tb.fo4;
import tb.tp4;
import tb.zhh;
import tb.zli;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MergePaths implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f1848a;
    public final MergePathsMode b;
    public final boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f1848a = str;
        this.b = mergePathsMode;
        this.c = z;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        if (lottieDrawable.F()) {
            return new zli(this);
        }
        zhh.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public MergePathsMode b() {
        return this.b;
    }

    public String c() {
        return this.f1848a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
