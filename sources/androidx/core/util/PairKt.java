package androidx.core.util;

import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\n¢\u0006\u0002\u0010\u0004\u001a*\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0006\u001a*\u0010\u0007\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\n¢\u0006\u0002\u0010\u0004\u001a*\u0010\u0007\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0006\u001a1\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\tH\u0086\b\u001a1\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\tH\u0086\b\u001a1\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a1\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086\b¨\u0006\f"}, d2 = {"component1", UTConstant.Args.UT_SUCCESS_F, ExifInterface.LATITUDE_SOUTH, "Landroid/util/Pair;", "(Landroid/util/Pair;)Ljava/lang/Object;", "Landroidx/core/util/Pair;", "(Landroidx/core/util/Pair;)Ljava/lang/Object;", "component2", "toAndroidPair", "Lkotlin/Pair;", "toAndroidXPair", "toKotlinPair", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PairKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <F, S> F component1(Pair<F, S> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (F) ipChange.ipc$dispatch("62593909", new Object[]{pair}) : pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (S) ipChange.ipc$dispatch("d7d35f4a", new Object[]{pair}) : pair.second;
    }

    public static final <F, S> Pair<F, S> toAndroidPair(kotlin.Pair<? extends F, ? extends S> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d2731f6e", new Object[]{pair});
        }
        return new Pair<>(pair.getFirst(), pair.getSecond());
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(kotlin.Pair<? extends F, ? extends S> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9ddb24a8", new Object[]{pair});
        }
        return new Pair<>(pair.getFirst(), pair.getSecond());
    }

    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(Pair<F, S> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.Pair) ipChange.ipc$dispatch("b570bd70", new Object[]{pair}) : new kotlin.Pair<>(pair.first, pair.second);
    }

    public static final <F, S> F component1(Pair<F, S> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (F) ipChange.ipc$dispatch("28ba2173", new Object[]{pair}) : (F) pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (S) ipChange.ipc$dispatch("b55a4c74", new Object[]{pair}) : (S) pair.second;
    }

    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(Pair<F, S> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.Pair) ipChange.ipc$dispatch("2043a146", new Object[]{pair}) : new kotlin.Pair<>(pair.first, pair.second);
    }
}
