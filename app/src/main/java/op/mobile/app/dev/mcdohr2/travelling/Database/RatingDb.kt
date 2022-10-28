package op.mobile.app.dev.mcdohr2.travelling.Database
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import androidx.sqlite.db.SupportSQLiteDatabase
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import op.mobile.app.dev.mcdohr2.travelling.ui.home.HomeViewModel
//
//@Database(entities = [HomeViewModel::class], version = 1, exportSchema = true)
//abstract class LoginDb : RoomDatabase() {
//    abstract fun ratingDao(): IRatingDao
//
//    companion object {
//        @Volatile
//        private var INSTANCE: LoginDb? = null
//
//        fun getDatabase(
//            context: Context,
//            scope: CoroutineScope
//        ): LoginDb {
//            return INSTANCE ?: synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    LoginDb::class.java,
//                    "login_database"
//                )
//                    .addCallback(LoginDbCallback(scope))
//                    .build()
//                INSTANCE = instance
//                instance
//            }
//        }
//    }
//
//    private class LoginDbCallback(
//        private val scope: CoroutineScope
//    ) : RoomDatabase.Callback() {
//        override fun onCreate(db: SupportSQLiteDatabase) {
//            super.onCreate(db)
//            INSTANCE?.let { database ->
//                scope.launch(Dispatchers.IO) {
//                    populateDb(database.ratingDao())
//                }
//            }
//        }
//
//        fun populateDb(ratingDao: IRatingDao) {
//            ratingDao.deleteAll()
//            var rating = Rating(17, 2)
//            ratingDao.insert(rating)
//            rating = Rating(12, 3)
//            ratingDao.insert(rating)
//        }
//    }
//}