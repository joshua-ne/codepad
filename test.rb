C1 = 1
module M
  C3 = 9
  class Test
    C2 = 3
    def x
      puts "x - C2 = #{C2}"
      puts "x - C1 = #{C1}"
      puts "x - C3 = #{C3}"
      puts "x - NEW = #{NEW}"
    end
    puts "C1 = #{C1}"
  end
end

obj = M::Test.new
M::NEW = 99
#obj.x
puts M.constants