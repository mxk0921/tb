package tb;

import io.unicorn.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.pa2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class khv implements pa2, e5m {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f22679a;
    public int d = 1;
    public final Map<String, pa2.a> b = new HashMap();
    public final Map<Integer, pa2.b> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements pa2.b {

        /* renamed from: a  reason: collision with root package name */
        public final FlutterJNI f22680a;
        public final int b;
        public final AtomicBoolean c = new AtomicBoolean(false);

        static {
            t2o.a(945815727);
            t2o.a(945815760);
        }

        public a(FlutterJNI flutterJNI, int i) {
            this.f22680a = flutterJNI;
            this.b = i;
        }

        @Override // tb.pa2.b
        public void a(ByteBuffer byteBuffer) {
            if (!this.c.getAndSet(true)) {
                int i = this.b;
                FlutterJNI flutterJNI = this.f22680a;
                if (byteBuffer == null) {
                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
                } else {
                    flutterJNI.invokePlatformMessageResponseCallback(i, byteBuffer, byteBuffer.position());
                }
            } else {
                throw new IllegalStateException("Reply already submitted");
            }
        }
    }

    static {
        t2o.a(945815726);
        t2o.a(945815758);
        t2o.a(945815720);
    }

    public khv(FlutterJNI flutterJNI) {
        this.f22679a = flutterJNI;
    }

    @Override // tb.pa2
    public void a(String str, pa2.a aVar) {
        Map<String, pa2.a> map = this.b;
        if (aVar == null) {
            hdh.e("UnicornMessenger", "Removing handler for channel '" + str + "'");
            ((HashMap) map).remove(str);
            return;
        }
        hdh.e("UnicornMessenger", "Setting handler for channel '" + str + "'");
        ((HashMap) map).put(str, aVar);
    }

    @Override // tb.pa2
    public void b(String str, ByteBuffer byteBuffer, pa2.b bVar) {
        int i;
        hdh.e("UnicornMessenger", "Sending message with callback over channel '" + str + "'");
        if (bVar != null) {
            i = this.d;
            this.d = i + 1;
            ((HashMap) this.c).put(Integer.valueOf(i), bVar);
        } else {
            i = 0;
        }
        FlutterJNI flutterJNI = this.f22679a;
        if (byteBuffer == null) {
            flutterJNI.dispatchEmptyPlatformMessage(str, i);
        } else {
            flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
        }
    }

    public void c(String str, byte[] bArr, int i) {
        ByteBuffer byteBuffer;
        hdh.e("UnicornMessenger", "Received message from Dart over channel '" + str + "'");
        pa2.a aVar = (pa2.a) ((HashMap) this.b).get(str);
        FlutterJNI flutterJNI = this.f22679a;
        if (aVar != null) {
            try {
                hdh.e("UnicornMessenger", "Deferring to registered handler to process message.");
                if (bArr == null) {
                    byteBuffer = null;
                } else {
                    byteBuffer = ByteBuffer.wrap(bArr);
                }
                aVar.a(byteBuffer, new a(flutterJNI, i));
            } catch (Exception e) {
                hdh.c("UnicornMessenger", "Uncaught exception in binary message listener", e);
                flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
            }
        } else {
            hdh.e("UnicornMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
        }
    }

    public void d(int i, byte[] bArr) {
        ByteBuffer byteBuffer;
        hdh.e("UnicornMessenger", "Received message reply from Dart.");
        pa2.b bVar = (pa2.b) ((HashMap) this.c).remove(Integer.valueOf(i));
        if (bVar != null) {
            try {
                hdh.e("UnicornMessenger", "Invoking registered callback for reply from Dart.");
                if (bArr == null) {
                    byteBuffer = null;
                } else {
                    byteBuffer = ByteBuffer.wrap(bArr);
                }
                bVar.a(byteBuffer);
            } catch (Exception e) {
                hdh.c("UnicornMessenger", "Uncaught exception in binary message reply handler", e);
            }
        }
    }

    public static void e() {
    }
}
