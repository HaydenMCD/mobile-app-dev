package op.mobile.app.dev.mcdohr2.travelling.Database
//
//import androidx.room.Dao
//import androidx.room.Insert
//import androidx.room.OnConflictStrategy
//import androidx.room.Query
//import kotlinx.coroutines.flow.Flow
//
//@Dao
//interface IRatingDao {
//        @Query("SELECT * FROM rating")
//        fun getAll(): Flow<List<Rating>>
//
//        @Insert(onConflict = OnConflictStrategy.IGNORE)
//        fun insert(rating: Rating)
//
//        @Query("DELETE FROM rating")
//        fun deleteAll()
//}