package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.jke;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u00020\u000b*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001aY\u0010\u000f\u001a\u00020\u000e*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/ParameterName;", "name", "info", "source", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", "action", "Landroid/graphics/Bitmap;", "decodeBitmap", "(Landroid/graphics/ImageDecoder$Source;Ltb/w1a;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "decodeDrawable", "(Landroid/graphics/ImageDecoder$Source;Ltb/w1a;)Landroid/graphics/drawable/Drawable;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ImageDecoderKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Bitmap decodeBitmap(ImageDecoder.Source source, final w1a<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, xhv> w1aVar) {
        Bitmap decodeBitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("63e82583", new Object[]{source, w1aVar});
        }
        decodeBitmap = ImageDecoder.decodeBitmap(source, jke.a(new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6b5aea9", new Object[]{this, imageDecoder, imageInfo, source2});
                } else {
                    w1aVar.invoke(imageDecoder, imageInfo, source2);
                }
            }
        }));
        return decodeBitmap;
    }

    public static final Drawable decodeDrawable(ImageDecoder.Source source, final w1a<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, xhv> w1aVar) {
        Drawable decodeDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("60095666", new Object[]{source, w1aVar});
        }
        decodeDrawable = ImageDecoder.decodeDrawable(source, jke.a(new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6b5aea9", new Object[]{this, imageDecoder, imageInfo, source2});
                } else {
                    w1aVar.invoke(imageDecoder, imageInfo, source2);
                }
            }
        }));
        return decodeDrawable;
    }
}
